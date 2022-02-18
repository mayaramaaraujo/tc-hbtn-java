import java.util.List;
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

    static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        return pedidos.stream()
                .filter(p -> p.getProdutos()
                        .stream()
                        .anyMatch(produto -> produto.getCategoria().equals(CategoriaProduto.ELETRONICO)))
                .collect(Collectors.toList());
    }

    static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
        return produtos.stream().map(produto -> {
            Double valorDesconto = produto.getPreco() * 0.15;
            if(produto.getCategoria().equals(CategoriaProduto.ELETRONICO)) {
                produto.setPreco(produto.getPreco() - valorDesconto);
            }
            return produto;
        }).collect(Collectors.toList());
    }

}
