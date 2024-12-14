import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Disciplina {
    private String codigo;
    private String nomeDisciplina;
    private Periodo periodo;
    private List<Aluno> alunosMatriculados = new ArrayList<>();

    public Disciplina(String cod) {
        this.codigo = cod;
        this.nomeDisciplina = nomeDisciplina;
        this.periodo = periodo;
        this.alunosMatriculados = alunosMatriculados;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

    public void matricularAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
    }
}

class Periodo {
    private Date dataInicio;
    private Date dataFim;

    public Periodo(Date inicio, Date fim) {
        this.dataInicio = inicio;
        this.dataFim = fim;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
}
