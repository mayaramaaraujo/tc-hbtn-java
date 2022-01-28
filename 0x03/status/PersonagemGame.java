public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public String getStatus() {
        return status;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if(this.saudeAtual > 0) {
            this.status = "vivo";
        } else {
            this.status = "morto";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void tomarDano(int quantidadeDeDano) {
        int saude = saudeAtual - quantidadeDeDano;
        if(saude > 0) {
            setSaudeAtual(saude);
        } else  {
            setSaudeAtual(0);
        }
    }

    public void receberCura(int quantidadeDeCura) {
        int saude = saudeAtual + quantidadeDeCura;
        if(saude < 100) {
            setSaudeAtual(saude);
        } else {
            setSaudeAtual(100);
        }
    }
}