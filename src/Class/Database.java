package Class;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:identifier.sqlite");
    }

}
