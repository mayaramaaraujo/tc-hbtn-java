import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private Double preco;
    private String nome;
    private Double percentualMarkUp;
    Consumer<Double> atualizarMarkUp = x -> this.percentualMarkUp = x;
    Supplier<Double> precoComMarkUp = () -> this.preco * (this.percentualMarkUp + 100)/100;

    public Produto(Double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
        this.percentualMarkUp = 10d;
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
