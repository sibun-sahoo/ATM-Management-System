package bank.management.system;
import java.sql.*;

public class DatabaseConnection {

    Connection conn;
    Statement st;

    public DatabaseConnection()
    {
        try{
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem" ,"root","Litindia@123");
                st = conn.createStatement();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    }
