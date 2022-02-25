public interface Armazenavel<V> {
    void adicionarAoInventario(String nome, V valor);

    V obterDoInventario(String nome);
}
