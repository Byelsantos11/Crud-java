import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/*Conexão feita */
public class Connection {

    private static final String URL = "";
    private static final String USER = "";
    private static final String PASSWORD = "";
    public String conn;

    public static Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Erro de conexão com banco: " + e.getMessage());
            throw e;
        }
    }
}
