import java.sql.*;

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
                "       nome VARCHAR(80) NOT NULL, \n" +
                "       idade integer NOT NULL,\n" +
                "       CPF VARCHAR(14) NOT NULL, \n" +
                "       RG VARCHAR(15) NOT NULL\n" +
                ");";

        statement.executeUpdate(sql);
        statement.close();
        connection.close();
    }

    @Override
    public void insert(String url_conexao, Cliente cliente) throws SQLException {
        Connection connection = connect(url_conexao);
        Statement statement = connection.createStatement();

        String sql = "INSERT INTO CLIENTE (nome,idade,CPF,RG) VALUES ('"+
                cliente.getNome() + "'," +
                cliente.getIdade() + "," +
                "'" + cliente.getCPF() + "'," +
                "'" + cliente.getRG() + "');";

        statement.executeUpdate(sql);
        statement.close();
        connection.close();
    }

    @Override
    public void selectAll(String urlConexao) throws SQLException {
        Connection connection = connect(urlConexao);
        Statement statement = connection.createStatement();

        String sql = "SELECT rowid, nome, idade, CPF, RG FROM CLIENTE;";

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            String nome = resultSet.getString("nome");
            Integer idade = resultSet.getInt("idade");
            String CPF = resultSet.getString("CPF");
            String RG = resultSet.getString("RG");

            System.out.println("ID:" + resultSet.getInt("rowid"));
            System.out.println("nome: " + nome);
            System.out.println("idade: " + idade);
            System.out.println("CPF: " + CPF);
            System.out.println("RG: " + RG + "\n");
        }

        statement.close();
        connection.close();
    }

    @Override
    public void update(String urlConexao, int id, String nome, Integer idade) throws SQLException {
        Connection connection = connect(urlConexao);
        Statement statement = connection.createStatement();

        String sql = "UPDATE CLIENTE SET nome='" + nome + "', idade='" + idade +"' WHERE rowid= '" + id +"';";

        statement.executeUpdate(sql);
        statement.close();
        connection.close();
    }

    @Override
    public void delete(String urlConexao, int id) throws SQLException {
        Connection connection = connect(urlConexao);
        Statement statement = connection.createStatement();

        String sql = "DELETE FROM CLIENTE WHERE rowid = " + id;

        statement.executeUpdate(sql);
        statement.close();
        connection.close();
    }
}
