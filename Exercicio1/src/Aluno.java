import java.util.*;

class Aluno {
    private int matricula;
    private String nomeAluno;
    private Map<String, String> disciplinasCursadas = new HashMap<>();

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nomeAluno = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nome) {
        this.nomeAluno = nomeAluno;
    }

    public Map<String, String> getDisciplinasCursadas() {
        return disciplinasCursadas;
    }

    public void matricular(Disciplina disciplina) {
        if (disciplina != null && disciplina.getNomeDisciplina() != null) {
            disciplinasCursadas.put(disciplina.getNomeDisciplina(), "Não avaliado");
            disciplina.matricularAluno(this);
        } else {
            System.out.println("Disciplina inválida para matrícula.");
        }
    }

    public void setResultado(Disciplina disciplina, String resultado) {
        if (disciplina != null && disciplina.getNomeDisciplina() != null) {
            disciplinasCursadas.put(disciplina.getNomeDisciplina(), resultado);
        } else {
            System.out.println("Disciplina inválida para atualizar resultado.");
        }
    }

    public String getResultado(Disciplina disciplina) {
        if (disciplina != null && disciplina.getNomeDisciplina() != null) {
            return disciplinasCursadas.getOrDefault(disciplina.getNomeDisciplina(), "Resultado não disponível");
        }
        return "Disciplina inválida.";
    }

}
