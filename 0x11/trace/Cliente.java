import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Double> transacoes;

    public Cliente(String nome) {
        this.nome = nome;
        this.transacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Double> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(Double valorTransacao) {
        this.transacoes.add(valorTransacao);
    }


}
