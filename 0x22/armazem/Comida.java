public class Comida {
    private String nome;
    private int calorias;
    private Double preco;

    public Comida(String nome, int calorias, Double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getCalorias() {
        return calorias;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format("%s %s %f", "[" + nome + "]", calorias, preco);
    }
}
