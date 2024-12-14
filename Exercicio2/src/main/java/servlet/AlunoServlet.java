package servlet;

import dao.AlunoDAO;
import entidade.Aluno;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/alunos")
public class AlunoServlet extends HttpServlet {
    private AlunoDAO alunoDAO = new AlunoDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            request.setAttribute("alunos", alunoDAO.listarTodos());
            request.getRequestDispatcher("/aluno-cadastro.jsp").forward(request, response);
        } catch (Exception e) {
            throw new ServletException("Erro ao listar alunos", e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Aluno aluno = new Aluno();
            aluno.setMatricula(Integer.parseInt(request.getParameter("matricula")));
            aluno.setNomeAluno(request.getParameter("nomeAluno"));

            alunoDAO.inserir(aluno);

            response.sendRedirect("alunos");
        } catch (Exception e) {
            throw new ServletException("Erro ao cadastrar aluno", e);
        }
    }
}
