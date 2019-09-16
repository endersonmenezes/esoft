package aep1;

public class Conceito {
    private String id;
    private Aluno aluno;
    private Avaliação avaliação;
    private Integer nota;

    public Conceito(Aluno aluno, Avaliação avaliação, Integer nota) {
        this.aluno = aluno;
        this.avaliação = avaliação;
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            throw new RuntimeException("Nota Inválida! O valor deve estar entre 0 e 10");
        }
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
