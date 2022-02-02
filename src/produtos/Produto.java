package produtos;

public abstract class Produto {
    private String titulo;
    private int ano;
    private String pais;
    private double precoBruto;

    public Produto(String titulo, int ano, String pais, double precoBruto) {
        this.titulo = titulo;
        this.ano = ano;
        this.pais = pais;
        this.precoBruto = precoBruto;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public String getPais() {
        return pais;
    }

    public double getPrecoBruto() {
        return precoBruto;
    }

    public abstract double obterPrecoLiquido();
}
