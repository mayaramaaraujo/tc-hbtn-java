import java.util.Locale;

public class Comida {
    private String nome;
    private Double calorias;
    private Double preco;

    public Comida(String nome, Double calorias, Double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getCalorias() {
        return calorias;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format(Locale.FRANCE,"%s %f R$ %f", "[" + nome + "]", calorias, preco);
    }
}
