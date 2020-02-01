package Model.Connection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class connectionToDB {
    
    Connection conn= null;
    public static Connection ConectorDb(){
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("org.postgresql.Driver");
            Connection conn =DriverManager.getConnection("jdbc:postgresql://localhost:5432/zhsm", "postgres", "postgres");
            conn.setAutoCommit(false);
            return conn;
       }catch (ClassNotFoundException e){
           JOptionPane.showMessageDialog(null, e);
           Logger.getLogger(connectionToDB.class.getName()).log(Level.SEVERE, null, e);
            return null;
       } catch (SQLException ex) {
            Logger.getLogger(connectionToDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
