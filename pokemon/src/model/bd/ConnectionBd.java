package model.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBd {
        public static Connection getConnexion() throws SQLException, ClassNotFoundException{
         Class.forName("com.mysql.jdbc.Driver");
    
         String login="root";
         String password= "usbw";
         String url = "jdbc:mysql://127.0.0.1:3307/pokemon";


         Connection con = DriverManager . getConnection (url ,login ,password);
         return (con);
}
}
