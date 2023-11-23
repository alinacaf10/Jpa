package dao.impl.Abstract;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class AbstractDAO {


    // TODO: This class will be used only inside this package, therefore, change methods and class' access modifiers
    //  to make it more secure. Remove static keyword as well.
    protected Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/db"; // TODO: database name should be the project name like resume or resume-db
        String username = "root";
        String pass = "12345";
        Connection connection = DriverManager.getConnection(url, username, pass);
        return connection;
    }

    //TODO: Change method name. This is the noun, and method names must be verb, like getConnection()

    //TODO: For security reasons, don't write Database credentials in this class, write them into file as properties,
    // then read from file, but for learning purpose it is okay to write them in this place.
    // Also don't forget to add that properties file into .gitignore.
}
