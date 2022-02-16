import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private Double preco;
    private String nome;
    private Double percentualMarkUp;
    Consumer<Double> atualizarMarkUp;
    Supplier<Double> precoComMarkUp;

    public Produto(Double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
        this.percentualMarkUp = 10d;
        this.precoComMarkUp =  new Supplier<Double>() {
            @Override
            public Double get() {
                return preco * (percentualMarkUp + 100)/100;
            }
        };
        this.atualizarMarkUp = new Consumer<Double>() {
            @Override
            public void accept(Double valor) {
                percentualMarkUp = valor;
            }
        };
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
