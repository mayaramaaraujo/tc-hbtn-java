import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {
    private HashMap<String, ArrayList<Telefone>> listaTelefonica;

    public ListaTelefonica() {
        listaTelefonica = new HashMap<String, ArrayList<Telefone>>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        if(buscar(nome) == null) {
            ArrayList<Telefone> telefones = new ArrayList<>();
            telefones.add(telefone);
            listaTelefonica.put(nome, telefones);
        } else {
            ArrayList<Telefone> telefones = buscar(nome);
            telefones.add(telefone);
        }
    }

    public ArrayList<Telefone> buscar(String nome) {
        if(!listaTelefonica.containsKey(nome)) {
            return null;
        }
        return listaTelefonica.get(nome);
    }
}
