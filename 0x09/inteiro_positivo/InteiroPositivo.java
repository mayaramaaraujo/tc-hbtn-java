public class InteiroPositivo {
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        this.valor = valor;
    }

    public InteiroPositivo(int valor) {
        Integer valorInteger = valor;
        setValor(valorInteger);
    }

    public InteiroPositivo(String valor) {
        setValor(Integer.parseInt(valor));
    }

    public boolean ehPrimo() {
        if(this.valor == 1) {
            return false;
        }

        for (int i = 2; i <= this.valor/2 ; i++) {
            if (this.valor % i == 0 || this.valor == 1) {
                return false;
            }
        }

        return true;
    }
}
