package dao;

import entidade.Aluno;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    public void inserir(Aluno aluno) throws SQLException {
        String sql = "INSERT INTO alunos (matricula, nome_aluno) VALUES (?, ?)";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, aluno.getMatricula());
            stmt.setString(2, aluno.getNomeAluno());
            stmt.executeUpdate();
        }
    }

    public Aluno buscarPorMatricula(int matricula) throws SQLException {
        String sql = "SELECT * FROM alunos WHERE matricula = ?";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, matricula);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Aluno aluno = new Aluno();
                    aluno.setMatricula(rs.getInt("matricula"));
                    aluno.setNomeAluno(rs.getString("nome_aluno"));
                    return aluno;
                }
            }
        }
        return null;
    }

    public List<Aluno> listarTodos() throws SQLException {
        List<Aluno> alunos = new ArrayList<>();
        String sql = "SELECT * FROM alunos";

        try (Connection conn = Conexao.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setMatricula(rs.getInt("matricula"));
                aluno.setNomeAluno(rs.getString("nome_aluno"));
                alunos.add(aluno);
            }
        }
        return alunos;
    }
}