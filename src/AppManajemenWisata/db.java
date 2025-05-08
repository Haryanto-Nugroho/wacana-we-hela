package AppManajemenWisata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    private static final String URL = "jdbc:mysql://localhost:3306/db_mpwkel4";
    private static final String USER = "root"; 
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection con= null;
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
