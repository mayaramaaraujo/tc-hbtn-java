import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Consulta {

    static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        return pedido.getProdutos().stream().filter(p -> p.getCategoria().equals(CategoriaProduto.LIVRO)).collect(Collectors.toList());
    }

    static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        Double maiorValor = produtos.stream().mapToDouble(Produto::getPreco).max().getAsDouble();
        return produtos.stream().filter(p -> p.getPreco() >= maiorValor).findFirst().get();
    }

    static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double valor) {
        return produtos.stream().filter(p -> p.getPreco() >= valor).collect(Collectors.toList());
    }

}
