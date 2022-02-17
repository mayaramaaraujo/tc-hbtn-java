import java.text.DecimalFormat;

public class Produto {
    private String nome;
    private double preco;
    private double peso;
    private int quantidadeEmEstoque;
    private TiposProduto tipo;

    public Produto(String nome, double preco, double peso, int quantidadeEmEstoque, TiposProduto tipo) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPeso() {
        return peso;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public TiposProduto getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###.000000");
        return this.nome + " " + df.format(this.preco) + " " + df.format(this.peso) + " " + this.quantidadeEmEstoque + " " + this.tipo;
    }
}
