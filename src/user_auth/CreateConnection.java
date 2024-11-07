package user_auth;
import java.sql.*;

public class CreateConnection {
    public static Connection create() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/work-stream","root","root");
        return con;
    }
}
