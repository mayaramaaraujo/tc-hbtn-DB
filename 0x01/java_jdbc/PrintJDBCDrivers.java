import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class PrintJDBCDrivers {
    public static void main(String[] args) {
        Enumeration<Driver> drivers = DriverManager.getDrivers();

        drivers.asIterator().forEachRemaining(
                driver -> System.out.println(driver.getClass().getName() + " " + driver.getMajorVersion())
        );
    }
}
