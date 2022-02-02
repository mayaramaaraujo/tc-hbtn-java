public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemPedido p: itens) {
           total = total + p.getQuantidade() * p.getProduto().obterPrecoLiquido();
        }

        if(percentualDesconto == 0.00) {
            return total;
        }

        return total - (total * percentualDesconto/100);
    }
}
