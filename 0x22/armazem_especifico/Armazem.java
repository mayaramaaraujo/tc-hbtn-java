import java.util.Map;
import java.util.TreeMap;

abstract class Armazem<V> implements Armazenavel<V> {
    private Map<String,V> itens;

    public Armazem() {
        this.itens = new TreeMap<>();
    }


    @Override
    public void adicionarAoInventario(String nome, V valor) {
        itens.put(nome, valor);
    }

    @Override
    public V obterDoInventario(String nome) {
        return itens.get(nome);
    }
}
