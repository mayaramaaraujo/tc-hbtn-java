import java.util.*;

public class AnalisadorFrase {

    public static TreeMap<String, Integer > contagemPalavras(String frase) {
        TreeMap<String, Integer> palavrasRepetidas = new TreeMap<>();

        Set<String> palavrasNaoRepetidas = new HashSet<>();

        String[] palavras = frase.split(" ");

        for (String palavra: palavras) {
            palavrasNaoRepetidas.add(palavra);
        }

        for (int i = 0; i < palavrasNaoRepetidas.size() ; i++) {
            palavras[i] = palavras[i].replaceAll("[?!.]", "");
            palavrasRepetidas.put(palavras[i], i);
        }

        return palavrasRepetidas;
    }
}
