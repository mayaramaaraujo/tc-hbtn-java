public class Numero {
    public static void dividir(int a, int b) {
        int resultado = 0;
        try {
            resultado = a / b;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Nao eh possivel dividir por zero");
        } finally {
            System.out.println(a + " / " + b + " = " + resultado);
        }
    }
}