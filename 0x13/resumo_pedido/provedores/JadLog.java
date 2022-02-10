package provedores;
import Frete;

public class JadLog implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete;

        if(peso > 2000) {
            valorFrete = valor * 0.07;
        } else {
            valorFrete = valor * 0.045;
        }

        return new Frete(valorFrete, TipoProvedorFrete.JADLOG);
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }


}
