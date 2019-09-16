package aep1;

public class Aluno {
    private final String cpf;
    private final String nome;
    private boolean necessidade_especial;

    public Aluno(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public boolean isNecessidade_especial() {
        return necessidade_especial;
    }

    public void setNecessidade_especial(boolean necessidade_especial) {
        this.necessidade_especial = necessidade_especial;
    }
}
