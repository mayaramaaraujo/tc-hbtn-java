import java.util.Locale;

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

        return total - (total * calcularPercentualDeDesconto());
    }

    public double calcularPercentualDeDesconto() {
        return percentualDesconto/100;
    }

    public double calcularTotalBruto() {
        double total = 0;
        for (ItemPedido p: itens) {
            total = total + p.getQuantidade() * p.getProduto().obterPrecoLiquido();
        }
        return total;
    }

    public void apresentarResumoPedido() {
        System.out.printf(Locale.FRANCE,"------- RESUMO PEDIDO -------" + "\n");
        for (ItemPedido p: itens) {
            System.out.printf("Tipo: " + p.getProduto().getClass().getSimpleName());
            System.out.printf("  Titulo: " + p.getProduto().getTitulo());
            System.out.printf(Locale.FRANCE, "  Preco: %.2f", p.getProduto().obterPrecoLiquido());
            System.out.printf("  Quant: " + p.getQuantidade());
            System.out.printf(Locale.FRANCE, "  Total: %.2f", p.getQuantidade() * p.getProduto().obterPrecoLiquido());
            System.out.printf("\n");
        }
        System.out.println("----------------------------");
        System.out.printf(Locale.FRANCE,"DESCONTO: %.2f", calcularTotalBruto() * calcularPercentualDeDesconto());
        System.out.printf("\n");
        System.out.printf(Locale.FRANCE,"TOTAL PRODUTOS: %.2f", calcularTotalBruto());
        System.out.printf("\n");
        System.out.println("----------------------------");
        System.out.printf(Locale.FRANCE,"TOTAL PEDIDO: %.2f", calcularTotal());
        System.out.printf("\n");
        System.out.println("----------------------------");
    }
}
