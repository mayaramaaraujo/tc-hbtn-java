package provedores;

public class Loggi implements ProvedorFrete {
    @Override
    public double calcularFrete(double peso, double valor) {
        double valorFrete;

        if(peso > 5000) {
            valorFrete = valor * 0.12;
        } else {
            valorFrete = valor * 0.04;
        }

        return valorFrete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
