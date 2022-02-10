import provedores.Frete;
import provedores.ProvedorFrete;
import provedores.TipoProvedorFrete;

public class Loggi implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete;

        if(peso > 5000) {
            valorFrete = valor * 0.12;
        } else {
            valorFrete = valor * 0.04;
        }

        return new Frete(valorFrete, TipoProvedorFrete.LOGGI);
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
