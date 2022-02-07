import java.util.List;

public class ManipularArrayNumeros {
    public static int buscarPosicaoNumero(List<Integer> numeros, int numero){
        if (numeros.contains(numero)) {
            return numeros.indexOf(numero);
        }
        return -1;
    };

    public static void adicionarNumero(List<Integer> inteiros, int numero) {
        if(inteiros.contains(numero)) {
            throw new IllegalArgumentException("Numero jah contido na lista");
        }

        inteiros.add(numero);
    }

    public static void removerNumero(List<Integer> inteiros, int numero){
        if (!inteiros.contains(numero)) {
            throw new IllegalArgumentException("Numero nao encontrado na lista");
        }

        inteiros.remove(inteiros.indexOf(numero));
    }

    public static void substituirNumero(List<Integer> inteiros, int numeroSubstituir, int numeroSubstituto) {
        if(inteiros.contains(numeroSubstituir)) {
            inteiros.set(inteiros.indexOf(numeroSubstituir), numeroSubstituto);
        } else {
            inteiros.add(numeroSubstituto);
        }
    }
}
