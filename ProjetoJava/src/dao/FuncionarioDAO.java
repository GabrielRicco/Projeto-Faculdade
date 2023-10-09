package dao;

import java.sql.*;
import conexao.ConnectionFactory;
import modelo.Funcionario;

public class FuncionarioDAO {

    private Connection connection;
    int id;
    String nome;
    String cpf;
    int salario;
    String funcao;
    String endereco;
    String telefone;

    public Object funcionario;

    public FuncionarioDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Funcionario funcionario) {
        String sql = "INSERT INTO funcionario(nome, cpf, salario, funcao, endereco, telefone) VALUES(?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setInt(3, funcionario.getSalario());
            stmt.setString(4, funcionario.getFuncao());
            stmt.setString(5, funcionario.getEndereco());
            stmt.setString(6, funcionario.getTelefone());

            stmt.execute();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

}
