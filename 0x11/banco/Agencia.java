import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<Cliente>();
    }

    public String getNome() {
        return nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public boolean novoCliente(String nome, Double valorTransacaoInicial) {
        Cliente novoCliente = new Cliente(nome);
        this.clientes.add(novoCliente);
        novoCliente.adicionarTransacao(valorTransacaoInicial);

        if(!clientes.equals(novoCliente)) {
            return false;
        }

        return true;
    }

    public boolean adicionarTransacaoCliente(String nomeDoCliente, Double valorTransacao) {
        Cliente cliente = buscarCliente(nomeDoCliente);

        cliente.adicionarTransacao(valorTransacao);

        if (!cliente.getTransacoes().equals(valorTransacao)) {
            return false;
        }

        return true;
    }

    public Cliente buscarCliente(String nomeDoCliente) {
        for (Cliente c: clientes) {
            if(c.getNome().equals(nomeDoCliente)) {
                return c;
            }
        }
        return null;
    }


}
