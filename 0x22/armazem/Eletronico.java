import java.util.Locale;

public class Eletronico {
    private String descricao;
    private Double valor;

    public String getDescricao() {
        return descricao;
    }

    public Eletronico(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.format(Locale.FRANCE, "%s %f", "[" + descricao + "]", valor);
    }
}
