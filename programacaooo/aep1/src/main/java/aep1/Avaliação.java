package aep1;

public class Avaliação {

    public Avaliação(String questoes, String respostas) {
        this.questoes = questoes;
        this.respostas = respostas;
    }

    private String id;
    private String questoes;
    private String respostas;

    public String getId() {
        return id;
    }

    public String getQuestoes() {
        return questoes;
    }

    public String getRespostas() {
        return respostas;
    }
}
