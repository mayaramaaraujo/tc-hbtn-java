import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T extends Midia>{
    private List<T> lista;

    public Biblioteca() {
        this.lista = new ArrayList<>();
    }

    public void adicionarMidia(T livro) {
        this.lista.add(livro);

    }

    public List<T> obterListaMidias() {
        return this.lista;
    }
}
