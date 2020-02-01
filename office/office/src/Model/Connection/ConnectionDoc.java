package Model.Connection;

import java.sql.*;
import javax.swing.*;
public class ConnectionDoc {
    
     Connection conn= null;
    public static Connection ConectorDb(){
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("org.postgresql.Driver");
            Connection conn =DriverManager.getConnection("jdbc:postgresql://localhost:5432/zhsm", "postgres", "postgres");
            return conn;
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
            return null;
       }
    }
    
}
