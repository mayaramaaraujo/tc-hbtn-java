package provedores;

public class JadLog implements ProvedorFrete {
    @Override
    public double calcularFrete(double peso, double valor) {
        double valorFrete;

        if(peso > 2000) {
            valorFrete = valor * 0.07;
        } else {
            valorFrete = valor * 0.045;
        }

        return valorFrete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }


}
