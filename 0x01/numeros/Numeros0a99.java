public class Numeros0a99 {
    public static void main(String[] args) {
        int numeroFinal = 99;
        int numeroInicial = 0;
        while (numeroInicial <= 99) {
            if(numeroInicial != 99) {
                System.out.print(numeroInicial + ", ");
            } else {
                System.out.print(numeroInicial + "\n");
            }
            numeroInicial++;
        }
    }
}