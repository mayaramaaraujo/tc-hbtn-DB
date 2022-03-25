import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ClienteDAOImpl implements ClienteDAO {

    @Override
    public Connection connect(String urlConexao) throws SQLException {
        return DriverManager.getConnection(urlConexao);
    }

    @Override
    public void createTable(String urlConexao) throws SQLException {
        Connection connection = connect(urlConexao);
        Statement statement = connection.createStatement();

        String sql = "CREATE TABLE IF NOT EXISTS CLIENTE(\n" +
                "nome VARCHAR(80) NOT NULL \n" +
                "idade INT NOT NULL \n" +
                "CPF VARCHAR(11) NOT NULL \n" +
                "RG VARCHAR(15) NOT NULL \n" +
                ");";

        statement.executeQuery(sql);
        statement.close();
        connection.close();
    }

    @Override
    public void insert(String url_conexao, Cliente cliente) {

    }

    @Override
    public void selectAll(String urlConexao) {

    }

    @Override
    public void update(String urlConexao, int id, String name, Integer idade) {

    }

    @Override
    public void delete(String urlConexao, int id) {

    }
}
