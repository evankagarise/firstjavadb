package firstdb.other;
import java.sql.*;

public class connection {
    Connection con = null;

    public static Connection connectDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelman",
            "root", "1234");

            return con;
        }
        catch (SQLException e) {
            System.out.println(e);
        }
    }
}