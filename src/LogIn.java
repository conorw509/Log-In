
import java.sql.Connection;
import java.sql.DriverManager;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author x14471692
 */
public class LogIn {
    

    public static void main(String[] args) {
        // TODO code application logic here

  new LoginFrame().setVisible(true);
  
String url = "jdbc:mysql://localhost:3306/login?autoReconnect=true&useSSL=false";
String username = "root";
String pass = "yes";


System.out.println("connecting to DB...");
      try
          (Connection conn = DriverManager.getConnection(url,username,pass)){
          System.out.println("connected");
          
      }catch(Exception e){
         System.out.println("cannot connect");
      }
      }
        
        
    }



    
    
    
    

