package entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Disciplina implements Serializable {
    private String codigo;
    private String nomeDisciplina;
    private Periodo periodo;
    private List<Aluno> alunosMatriculados;

    public Disciplina() {
    }

    public Disciplina(String codigo, List<Aluno> alunosMatriculados) {
        this.codigo = codigo;
        this.alunosMatriculados = new ArrayList<>();
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getNomeDisciplina() { return nomeDisciplina; }
    public void setNomeDisciplina(String nomeDisciplina) { this.nomeDisciplina = nomeDisciplina; }
    public Periodo getPeriodo() { return periodo; }
    public void setPeriodo(Periodo periodo) { this.periodo = periodo; }
    public List<Aluno> getAlunosMatriculados() { return alunosMatriculados; }

    public void matricularAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
    }
}