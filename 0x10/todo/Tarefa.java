public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador) {
        this.descricao = descricao;
        this.identificador = identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean estahFeita() {
        return estahFeita;
    }

    public int getIdentificador() {
        return this.identificador;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void modificaDescricao(String novaDescricao) {
        if(novaDescricao.isEmpty()) {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }

        setDescricao(novaDescricao);
    }
}
