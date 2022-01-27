public class Quadrado {
    public static double area(double lado) {
       if (lado < 0) {
           throw new IllegalArgumentException("Lado deve possuir valor positivo");
       }

       return lado * lado;
    }
}
