package dao;

import java.sql.*;
import conexao.ConnectionFactory;
import modelo.Convidado;

public class ConvidadoDAO {

    private Connection connection;

    int id;
    String nome;
    String cpf;
    int valorPago;

    public Object convidado;

    public ConvidadoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Convidado convidado) {
        String sql = "INSERT INTO convidado(nome, cpf, valorPago) VALUES(?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, convidado.getNome());
            stmt.setString(2, convidado.getCpf());
            stmt.setInt(3, convidado.getValorPago());

            stmt.execute();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
