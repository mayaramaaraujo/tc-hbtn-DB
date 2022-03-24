import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSQLite {

    public static void main(String[] args) throws SQLException {
       initConnection();
    }

    public static void initConnection() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:sqlite_database_2022.db");
    }
}
