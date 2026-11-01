
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.spi.DirStateFactory;

public class ConnectionFactory {
    
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/PreprojetoDB2";
    private static final String USER = "root";
    private static final String PASS = "";
    
    
    public static Connection getConnection(){
        try { 
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
            
            
            
            
        } catch (ClassNotFoundException | SQLException ex) {
           throw new RuntimeException("Erro na conexão : ", ex);
        }
    
    
    }
    
    
    
    
   public static void closeConnection(Connection con){
 try {
     try (con) {
         if(con!=null){
             
             
         } }
       } catch (SQLException ex) {
           System.getLogger(ConnectionFactory.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
       }
   } 
   
   
   
   
   
   
   
   
public static void closeConnection(Connection con, PreparedStatement stmt){
         
         closeConnection(con);
         
 try {
     try (con) {
         if(stmt!=null){
             stmt.close();
             
       } 
     }
       } catch (SQLException ex) {
           System.getLogger(ConnectionFactory.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
       }
   
   
   } 
    

   
   
public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
         
         closeConnection(con,stmt);
         
 try {
     try (con) {
         if(rs!=null){
             rs.close();
             
       } 
     }
       } catch (SQLException ex) {
           System.getLogger(ConnectionFactory.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
       }
   
   
   } 

  
    
}
