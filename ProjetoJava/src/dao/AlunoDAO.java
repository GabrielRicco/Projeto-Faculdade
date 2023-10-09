package dao;

import java.sql.*;
import conexao.ConnectionFactory;
import modelo.Aluno;

public class AlunoDAO {

    private final Connection connection;

    public Object alunos;

    public AlunoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Aluno aluno) {
        String sql = "INSERT INTO aluno(nome, cpf, idade, mensalidade, multaAtraso, endereco, telefone, plano) VALUES(?,?,?,?,?,?,?,?)";

        try {
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, aluno.getNome());
                stmt.setString(2, aluno.getCpf());
                stmt.setInt(3, aluno.getIdade());
                stmt.setInt(4, aluno.getMensalidade());
                stmt.setInt(5, aluno.getMultaAtraso());
                stmt.setString(6, aluno.getEndereco());
                stmt.setString(7, aluno.getTelefone());
                stmt.setString(8,aluno.getPlano());
                
                stmt.execute();
            }

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
