public class ContaBancariaBasica {
    private String numeracao;
    private double saldo = 0;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        } else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0 ) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        } else if (valor > this.saldo) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que o saldo atual");
        } else {
            this.saldo = this.saldo - valor;
        }
    }

    public double calcularTarifaMensal() {
        double tarifa = 10.00;
        if(tarifa < this.saldo * 0.1) {
            return tarifa;
        } else {
            return this.saldo * 0.1;
        }
    }

    public double calcularJurosMensal() {
        if(this.saldo < 0) {
            return 0;
        } else {
            return (this.taxaJurosAnual / 12 / 100) * this.saldo;
        }
    }

    public void aplicarAtualizacaoMensal() {
        this.saldo = this.saldo - calcularTarifaMensal() + calcularJurosMensal();
    }

}