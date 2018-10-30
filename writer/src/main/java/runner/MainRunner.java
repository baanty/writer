package runner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MainRunner {

    public static final String PI_GET_KYC_PI_AUDIT_IDS_SQL = 
            "SELECT KYC_AUDIT_ID " 
                  + "FROM KYC_PI_AUDIT "
                  + "WHERE (NVL(EXPORT_DATE, TO_DATE('01/01/2090', 'DD/MM/YYYY')) = TO_DATE('01/01/2090', 'DD/MM/YYYY')) "
                  + "AND ING_COUNTRY = :1 "
                  + "AND ROWNUM <=:2 " ;


    
    
    
    public static void main(String[] args) throws ParseException{
        System.out.println(PI_GET_KYC_PI_AUDIT_IDS_SQL);
        System.out.println("Running Main");
        dateTest();
    }
    
    private static void dateTest() throws ParseException{
        Long timestampLong = 1509027689L;
        LocalDateTime dateTime = Instant.ofEpochMilli(timestampLong * 1000).atZone(ZoneId.systemDefault()).toLocalDateTime();
        Date date = Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(date);
        
        calculateDateDiff("01/01/2013", "06/01/2013");
    }
    
    
    private static void calculateDateDiff(String date1, String date2) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d1 = sdf.parse(date1);
        Date d2 = sdf.parse(date2);
        long daysDiff = TimeUnit.DAYS.convert((d1.getTime()-d2.getTime()), TimeUnit.MILLISECONDS);
        System.out.println("Testing me "+daysDiff);
    }
}
