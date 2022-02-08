import java.util.ArrayList;
import java.util.List;

public class Celular {
    private List<Contato> contatos;

    public Celular() {
        this.contatos = new ArrayList<Contato>();
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void adicionarContato(Contato contato) {
        for (Contato c: this.contatos) {
            if (c.getNome().equals(contato.getNome())) {
                throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
            }
        }

        contatos.add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) {

        if(verificarSeContatoExiste(contatoAntigo.getNome())) {
            if (contatoAntigo.getNome().equals(novoContato.getNome())) {
                Integer posicao = obterPosicao(contatoAntigo.getNome());
                this.contatos.set(posicao, novoContato);

            } else if (verificarSeContatoExiste(novoContato.getNome())) {
                throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
            }
        } else {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        }
    }

    public void removerContato(Contato contato) {
        for (int i = 0; i < this.contatos.size(); i++) {
            if(!this.contatos.contains(contato)) {
                throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
            }

            this.contatos.remove(this.contatos.indexOf(contato));
        }
    }

    public List<Contato> buscarContato(String nome) {
        List<Contato> contatosBuscados = new ArrayList<>();

        for (int i = 0; i < this.contatos.size(); i++) {
            if(this.contatos.get(i).getNome().contains(nome)) {
                contatosBuscados.add(this.contatos.get(i));
            };
        }

        return contatosBuscados;
    }

    public void listarContatos() {
        this.contatos.forEach(c -> {
            System.out.println(c);
        });
    }

    public boolean verificarSeContatoExiste(String nome) {
        for (Contato contato:this.contatos) {
            if(contato.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public int obterPosicao(String nome) {
        for (int i = 0; i < this.contatos.size(); i++) {
            if(this.contatos.get(i).getNome().equals(nome)) {
                return i;
            }
        }

        return -1;
    }
}
