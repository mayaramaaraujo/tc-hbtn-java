import java.util.HashSet;
import java.util.TreeSet;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] inteiros) {
        HashSet<Integer> todosOsInteiros = new HashSet<>();
        TreeSet<Integer> inteirosDuplicados = new TreeSet<>();

        for (Integer inteiro: inteiros) {
            if(!todosOsInteiros.add(inteiro)) {
                inteirosDuplicados.add(inteiro);
            }
        }

        return inteirosDuplicados;
    }
}
