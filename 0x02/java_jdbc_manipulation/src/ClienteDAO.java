import java.sql.Connection;
import java.sql.SQLException;

public interface ClienteDAO {
    public Connection connect(String urlConexao) throws SQLException;
    public void createTable(String urlConexao) throws SQLException, ClassNotFoundException;
    public void insert(String url_conexao, Cliente cliente) throws SQLException;
    public void selectAll(String urlConexao) throws SQLException;
    public void update(String urlConexao, int id, String name, Integer idade) throws SQLException;
    public void delete(String urlConexao, int id) throws SQLException;
}
