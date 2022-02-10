import provedores.ProvedorFrete;

public class ProcessadorPedido {
    private ProvedorFrete provedorFrete;

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

    public void processar(Pedido pedido) {
       double valorFrete = provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal());

       Frete frete = new Frete(valorFrete, provedorFrete.obterTipoProvedorFrete());
       pedido.setFrete(frete);
    }
}
