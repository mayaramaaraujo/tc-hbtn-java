import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumeroDuplicados {

    public TreeSet<Integer> buscar(Integer[] inteiros) {
        Set<Integer> integers = new HashSet<>();

        for (Integer inteiro: inteiros) {
            integers.add(inteiro);
        }

        TreeSet<Integer> inteirosNaoRepetidos = new TreeSet<>();

        for (Integer integer: integers) {
            inteirosNaoRepetidos.add(integer);
        }


        System.out.println(integers);
        return inteirosNaoRepetidos;

    }
}
