package dao.DaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class AbstractDAO {

    public static Connection connector() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/db";
        String username="root";
        String pass="12345";
        Connection connection= DriverManager.getConnection(url,username,pass);
        return connection;
    }
}
