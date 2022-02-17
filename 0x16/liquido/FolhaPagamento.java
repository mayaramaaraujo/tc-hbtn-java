public class FolhaPagamento{
    static double calcularLiquido(Funcionario funcionario, CalculadorDeSalario calculadorDeSalario) {
        return calculadorDeSalario.calcular(funcionario.getSalario());
    }
}
