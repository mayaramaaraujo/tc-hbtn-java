import java.util.*;

public class AnalisadorFrase {

    public static TreeMap<String, Integer > contagemPalavras(String frase) {
        TreeMap<String, Integer> listaPalavras = new TreeMap<>();

        String[] palavras = frase.split(" ");

        for (String palavra: palavras) {
            palavra = palavra.replaceAll("[?!.]", "").toLowerCase(Locale.ROOT);

            if(listaPalavras.containsKey(palavra)) {
                Integer i = listaPalavras.get(palavra);
                i++;
                listaPalavras.put(palavra, i);
            } else {
                listaPalavras.put(palavra, 1);
            }
        }

        return listaPalavras;
    }
}
