package aep1;

public class Conceito {
    private String id;
    private Aluno aluno;
    private Avaliação avaliação;
    private Integer nota;

    public Conceito(Aluno aluno, Avaliação avaliação, Integer nota) {
        this.aluno = aluno;
        this.avaliação = avaliação;
        this.nota = nota;
    }

    public String getId() {
        return id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Avaliação getAvaliação() {
        return avaliação;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }
}
