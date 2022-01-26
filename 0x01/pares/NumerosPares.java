public class NumerosPares {
    public static void main(String[] args) {
        int numeroInicial = 0;
        int numeroFinal = 100;
        while (numeroInicial < numeroFinal) {
            if ((numeroInicial % 2) == 0) {
                if(numeroInicial != 98) {
                    System.out.print(numeroInicial + ", ");
                } else {
                    System.out.print(numeroInicial + "\n");
                }
            }
            numeroInicial++;
        }
    }
}
