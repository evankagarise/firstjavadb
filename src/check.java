package firstdb.src;
import java.sql.*;

public class check {
    public static void main(String args[]){
        Connection connection = null;
        try {
            //connectivity
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "databaseName", "databasePassword");

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                "select * from designation");
                int code;
                String title;
                while (resultSet.next()) {
                    code = resultSet.getInt("code");
                    title = resultSet.getString("title").trim();
                    System.out.println("Code :" + code + " Title : " +title);
                }
                resultSet.close();
                statement.close();
                connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
