import java.util.ArrayList;
import java.util.List;

public class Sistema {
        private List<Aluno> alunos = new ArrayList<>();
        private List<Disciplina> disciplinas = new ArrayList<>();

        // Métodos para cadastrar alunos, disciplinas, matricular alunos, lançar resultados, etc.

        public void imprimirResultadosPorPeriodoEDisciplina(Periodo periodo) {
            for (Disciplina disciplina : disciplinas) {
                if (disciplina.getPeriodo().equals(periodo)) {
                    System.out.println("Disciplina: " + disciplina.getNomeDisciplina());
                    for (Aluno aluno : disciplina.getAlunosMatriculados()) {
                        System.out.println("  Aluno: " + aluno.getNomeAluno() + ", Resultado: " +
                                aluno.getResultado((Disciplina) disciplina));
                    }
                }
            }
        }
}
