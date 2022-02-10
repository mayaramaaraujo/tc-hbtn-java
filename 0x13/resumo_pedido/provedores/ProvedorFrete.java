package provedores;

public interface ProvedorFrete {
    double calcularFrete(double peso, double valor);

    TipoProvedorFrete obterTipoProvedorFrete();
}
