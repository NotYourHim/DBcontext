package context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBContext {
    
    /*USE BELOW METHOD FOR YOUR DATABASE CONNECTION FOR BOTH SINGLE AND MULTILPE SQL SERVER INSTANCE(s)*/
    /*DO NOT EDIT THE BELOW METHOD, YOU MUST USE ONLY THIS ONE FOR YOUR DATABASE CONNECTION*/
     public Connection getConnection()throws Exception {
        String url = "jdbc:sqlserver://"+serverName+":"+portNumber +";databaseName="+dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }
    
    /*Insert your other code right after this comment*/
   
    /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
   private final String serverName = "localhost";
    private final String dbName = "Y19S3B1";
    private final String portNumber = "1433";
    private final String userID = "sa";
    private final String password = "sa";
    public static void main(String[] args) {
         try {
             System.out.println(new DBContext().getConnection());
             System.out.println("SUSSET");
         } catch (Exception ex) {
             Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
}