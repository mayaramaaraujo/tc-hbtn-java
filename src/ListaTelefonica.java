import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ListaTelefonica {
    private HashMap<String, HashSet<Telefone>> listaTelefonica;

    public ListaTelefonica() {
        listaTelefonica = new HashMap<String, HashSet<Telefone>>();
    }

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone) {
        if(buscar(nome) == null) {
            HashSet<Telefone> telefones = new HashSet<>();
            telefones.add(telefone);
            listaTelefonica.put(nome, telefones);
            return telefones;
        } else {
            HashSet<Telefone> telefones = buscar(nome);

            if(listaTelefonica.get(nome).contains(telefone)) {
                throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
            };

            for (Map.Entry<String, HashSet<Telefone>> lista:listaTelefonica.entrySet()) {
                if(lista.getValue().contains(telefone)) {
                    throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                }
            }

            telefones.add(telefone);
            return telefones;
        }
    }

    public HashSet<Telefone> buscar(String nome) {
        if(!listaTelefonica.containsKey(nome)) {
            return null;
        }
        return listaTelefonica.get(nome);
    }
}
