package provedores;

public class Sedex implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete;

        if(peso > 1000) {
            valorFrete = valor * 0.1;
        } else {
            valorFrete = valor * 0.05;
        }

        return new Frete(valorFrete, TipoProvedorFrete.SEDEX);
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
