import java.sql.DriverManager;

public class PrintJDBCDrivers {
    public static void main(String[] args) {
        DriverManager.getDrivers().asIterator().forEachRemaining(driver -> System.out.println(driver.getClass().getName() + " " + driver.getMajorVersion()));
    }
}
