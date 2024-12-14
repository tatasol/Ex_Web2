import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

// Supondo que a classe Disciplina seja algo como:
public class Main {
    public static void main(String[] args) {
        // Criando instâncias da classe Aluno
        Aluno aluno1 = new Aluno(12345, "João Silva");
        Aluno aluno2 = new Aluno(67890, "Maria Oliveira");

        // Criando instâncias da classe Disciplina
        Disciplina disciplinaMatematica = new Disciplina("Matemática");
        Disciplina disciplinaPortugues = new Disciplina("Português");

        // Matriculando alunos nas disciplinas
        aluno1.matricular(disciplinaMatematica);
        aluno1.matricular(disciplinaPortugues);
        aluno2.matricular(disciplinaMatematica);

        // Definindo resultados para os alunos
        aluno1.setResultado(disciplinaMatematica, "Aprovado");
        aluno1.setResultado(disciplinaPortugues, "Reprovado");
        aluno2.setResultado(disciplinaMatematica, "Aprovado");

        // Obtendo e exibindo resultados
        System.out.println(aluno1.getNomeAluno() + " - Matemática: " + aluno1.getResultado(disciplinaMatematica));
        System.out.println(aluno1.getNomeAluno() + " - Português: " + aluno1.getResultado(disciplinaPortugues));
        System.out.println(aluno2.getNomeAluno() + " - Matemática: " + aluno2.getResultado(disciplinaMatematica));
    }
}
