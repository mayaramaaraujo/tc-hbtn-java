public class Gerente extends Empregado {
    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        if(departamento.alcancouMeta()) {
            return (this.salarioFixo * 0.2) + (departamento.getValorAtingidoMeta() - departamento.getValorMeta()) * 0.01;
        } else {
            return 0;
        }
    }
}
