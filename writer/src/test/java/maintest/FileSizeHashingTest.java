/**
 * 
 */
package maintest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * @author WE43MM
 *
 */
public class FileSizeHashingTest {

    /**
     * @param args
     * @throws IOException 
     */
    
    String[] encodings = {"Cp858",};
    
    //private static String fileName = "H:\\ING\\testdata\\pijush-test\\test-FR-batch_data_kyc_fatca.csv";
    private static String fileName = "H:\\ING\\Sprints\\sprint-50\\BCDPRJ-36179\\BCDPRJ-36179\\BATCHPRIVKYC-AU-20171107-001.CSV";
    //private static String fileName = "H:\\ING\\testdata\\pijush-test\\test-FR-batch_data_kyc_cdd-3.CSV";
   
    
    //private Charset charsetEncoding = StandardCharsets.ISO_8859_1;
    private Charset charsetEncoding = Charset.forName("windows-1252"); //windows-1252
    
    
    
    public static void main(String[] args) throws IOException {
        try {
            
            FileSizeHashingTest currentInstance = new FileSizeHashingTest();
            String salt = currentInstance.getSalt(fileName);
            /*System.out.println("File Checksum with old technique is - "+currentInstance.getFileCheckSum(fileName, salt));
            System.out.println("File Checksum with String is - "+currentInstance.getFileCheckSumString(fileName, salt));*/
            System.out.println("File Checksum with Old way byte array is - "+currentInstance.getFileInputStreamFromBytes(fileName, salt));
            //System.out.println("File Checksum with String is - "+currentInstance.getFileCheckSumStringFromByteArray(fileName, salt));
            //System.out.println("File Checksum with String is - "+currentInstance.getFileCheckSumString(fileName, salt));
            System.out.println("File Checksum with String is - "+currentInstance.getFileCheckSumString(fileName, salt));
            System.out.println("File Checksum with byte array is - "+currentInstance.getFileCheckSumStringFromByteArray(fileName, salt));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public String getSalt(String fileName) throws IOException, NoSuchAlgorithmException{
        File inputCsvFile = new File(fileName); 
        String fileSizeInString = String.valueOf(Files.size(Paths.get(inputCsvFile.getPath())));
        System.out.println("fileSizeInString = "+fileSizeInString);
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        md.update(fileSizeInString.getBytes());
        byte[] digestedBytes = md.digest();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < digestedBytes.length; i++) {
          sb.append(Integer.toString((digestedBytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }
    
    public String getFileCheckSumString(String fileName , String salt) throws IOException, NoSuchAlgorithmException{
     File inputCsvFile = new File(fileName); 
     MessageDigest md = MessageDigest.getInstance("SHA-256");
     Files.readAllLines(Paths.get(inputCsvFile.getPath()),charsetEncoding)
          .stream()
          .forEach(line -> md.update(line.getBytes()));
     md.update(salt.getBytes());
     byte[] digestedBytes = md.digest();
     StringBuffer sb = new StringBuffer();
     for (int i = 0; i < digestedBytes.length; i++) {
       sb.append(Integer.toString((digestedBytes[i] & 0xff) + 0x100, 16).substring(1));
     }
     return sb.toString();
    }


    
    public String getFileCheckSumStringFromByteArray(String fileName , String salt) throws IOException, NoSuchAlgorithmException{
        File inputCsvFile = new File(fileName); 
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(Files.readAllBytes(Paths.get(inputCsvFile.getPath())));
        md.update(salt.getBytes());
        byte[] digestedBytes = md.digest();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < digestedBytes.length; i++) {
          sb.append(Integer.toString((digestedBytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
       }

    
    public String getFileInputStreamFromBytes(String fileName , String salt) throws IOException, NoSuchAlgorithmException{
        InputStream fis =  new FileInputStream(fileName);

        byte[] buffer = new byte[1024];
        MessageDigest complete = MessageDigest.getInstance("SHA-256");
        int numRead;

        do {
            numRead = fis.read(buffer);
            if (numRead > 0) {
                complete.update(buffer, 0, numRead);
            }
        } while (numRead != -1);

        fis.close();
        complete.update(salt.getBytes());
        byte[] b =  complete.digest();
        String result = "";

        for (int i=0; i < b.length; i++) {
            result += Integer.toString( ( b[i] & 0xff ) + 0x100, 16).substring( 1 );
        }
        return result;
    }
    
    public String getFileCheckSum(String fileName, String salt) throws NoSuchAlgorithmException{
        FileInputStream input;  
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        try {
            input = new FileInputStream(new File(fileName));
            CharsetDecoder decoder = charsetEncoding.newDecoder().onMalformedInput(CodingErrorAction.IGNORE);
            InputStreamReader reader = new InputStreamReader(input, decoder);
            BufferedReader bufferedReader = new BufferedReader( reader );
            String line = bufferedReader.readLine();
            while( line != null ) {
                md.update(line.getBytes());
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            md.update(salt.getBytes());
        } catch (FileNotFoundException e) {;
            e.printStackTrace();
        } catch( IOException e ) {
            e.printStackTrace();
        }
        byte[] digestedBytes = md.digest();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < digestedBytes.length; i++) {
          sb.append(Integer.toString((digestedBytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }

}
