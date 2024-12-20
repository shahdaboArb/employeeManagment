
package employeemangementsystem;



import java.sql.*;
public class DatabaseConnectionManager {
    private static volatile DatabaseConnectionManager instance; // Add volatile
    private Connection connection;

    private static final String URL = "jdbc:mysql://localhost:3306/employee_project";
    private static final String USER = "shahd";
    private static final String PASSWORD = "1234";

    private DatabaseConnectionManager() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("COnnetion error "+ e.getMessage());
        }
    }

    public static DatabaseConnectionManager getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnectionManager.class) {
                if (instance == null) {
                    try {
                        instance = new DatabaseConnectionManager();
                    } catch (Exception e) {
                        System.out.println("Failed to create DatabaseConnectionManager instance"+ e);
                    }
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
