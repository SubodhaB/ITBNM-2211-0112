
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INTERWEB
 */
public class dbconnection {
    
   public static Connection connection () throws ClassNotFoundException, SQLException{
     try {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Bakezone","root","");
         return con;
     } 
     catch(ClassNotFoundException|SQLException e )
     {
         System.out.println(e);
         return null;
     }
   }
           
    
}
