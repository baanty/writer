/**
 * 
 */
package batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author we43mm
 *
 */
public class InsertInLocalApacheDB {

    private static final String SQL = "INSERT INTO POLAND_IN_MAIN_26_APRIL_004 VALUES ? ";
    
    private static String dbURL = "jdbc:derby://localhost:1527/app;create=true";
    
    private static String user = "app";
    
    private static String password = "";
    
    private static Connection APACHE_DERBY_CONNECTION = null;
    
    static {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            //Get a connection
            APACHE_DERBY_CONNECTION = DriverManager.getConnection(dbURL); 
        }
        catch (Exception except)
        {
            except.printStackTrace();
        }
    }
    
    
    private static final void closeConnection(){
        try {
            if(APACHE_DERBY_CONNECTION != null){
                APACHE_DERBY_CONNECTION.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
