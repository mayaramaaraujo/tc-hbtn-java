import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    Consumer<Double> atualizarMarkUp;
    private Double preco;
    private String nome;
    private Double percentualMarkUp;
    Supplier<Double> precoComMarkUp;

    public Produto(Double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
        this.percentualMarkUp = 10d;
        this.precoComMarkUp = () -> this.preco * (percentualMarkUp + 100)/100;
        this.atualizarMarkUp = (valor) -> this.percentualMarkUp = valor;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Double getPercentualMarkUp() {
        return percentualMarkUp;
    }
}
