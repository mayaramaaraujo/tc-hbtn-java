public interface ProvedorFrete {
    Frete calcularFrete(double peso, double valor);

    TipoProvedorFrete obterProvedorFrete();
}
