package dao;

import java.sql.*;
import conexao.ConnectionFactory;
import modelo.Professor;

public class ProfessorDAO {

    private final Connection connection;

    public Object professor;

    public ProfessorDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Professor professor) {
        String sql = "INSERT INTO professor(nome, cpf, salario, endereco, telefone, horas) VALUES(?,?,?,?,?,?)";

        try {
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, professor.getNome());
                stmt.setString(2, professor.getCpf());
                stmt.setDouble(3, professor.getSalario());
                stmt.setString(4, professor.getEndereco());
                stmt.setString(5, professor.getTelefone());
                stmt.setInt(6, professor.getHoras());
                
                stmt.execute();
            }

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
