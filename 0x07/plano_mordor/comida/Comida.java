package comida;

public abstract class Comida {
    protected int pontosDeFelicidade;

    public Comida(int pontosDeFelicidade) {
        this.pontosDeFelicidade = pontosDeFelicidade;
    }

    public int getPontosDeFelicidade() {
        return pontosDeFelicidade;
    }
}
