package entidade;
import java.io.Serializable;

public class Periodo implements Serializable {
    private float id;
    private int anoPeriodo;
    private int semestre;

    public Periodo() {}

    public Periodo(int anoPeriodo, int semestre) {
        this.anoPeriodo = anoPeriodo;
        this.semestre = semestre;
    }

    public float getId() {
        return id;
    }

    public void setId(int anoPeriodo, int semestre) {
        this.id = anoPeriodo + (semestre/10);
    }

    public int getAnoPeriodo() {
        return anoPeriodo;
    }

    public void setAnoPeriodo(int anoPeriodo) {
        this.anoPeriodo = anoPeriodo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
