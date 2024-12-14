package entidade;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Aluno implements Serializable {
    private int matricula;
    private String nomeAluno;
    private Map<String, String> disciplinasCursadas;

    public Aluno() {
        this.disciplinasCursadas = new HashMap<>();
    }

    public Aluno(int matricula, String nomeAluno) {
        this.matricula = matricula;
        this.nomeAluno = nomeAluno;
        this.disciplinasCursadas = new HashMap<>();
    }

    // Getters and setters
    public int getMatricula() { return matricula; }
    public void setMatricula(int matricula) { this.matricula = matricula; }
    public String getNomeAluno() { return nomeAluno; }
    public void setNomeAluno(String nomeAluno) { this.nomeAluno = nomeAluno; }
    public Map<String, String> getDisciplinasCursadas() { return disciplinasCursadas; }

    public void matricular(Disciplina disciplina) {
        if (disciplina != null && disciplina.getNomeDisciplina() != null) {
            disciplinasCursadas.put(disciplina.getNomeDisciplina(), "Não avaliado");
        }
    }

    public void setResultado(Disciplina disciplina, String resultado) {
        if (disciplina != null && disciplina.getNomeDisciplina() != null) {
            disciplinasCursadas.put(disciplina.getNomeDisciplina(), resultado);
        }
    }

    public String getResultado(Disciplina disciplina) {
        if (disciplina != null && disciplina.getNomeDisciplina() != null) {
            return disciplinasCursadas.getOrDefault(disciplina.getNomeDisciplina(), "Resultado não disponível");
        }
        return "Disciplina inválida.";
    }
}