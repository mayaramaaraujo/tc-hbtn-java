import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Banco {
    private String nome;
    private List<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<Agencia>();
    }

    public String getNome() {
        return nome;
    }

    public List<Agencia> getAgencias() {
        return agencias;
    }

    public boolean adicionarAgencia(String nome) {
        Agencia novaAgencia = new Agencia(nome);
        agencias.add(novaAgencia);

        if(!this.agencias.equals(novaAgencia)) {
            return false;
        }

        return true;
    }

    public boolean adicionarCliente(String nomeDaAgencia, String nomeDoCliente, Double valorTransacao) {
        Agencia agencia = buscarAgencia(nomeDaAgencia);
        agencia.novoCliente(nomeDoCliente, valorTransacao);

        for (Cliente c: agencia.getClientes()) {
            if(!c.getNome().equals(nomeDoCliente)) {
                return false;
            }
        }

        return true;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeDoCliente, Double valorTransacao) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        return agencia.adicionarTransacaoCliente(nomeDoCliente,valorTransacao);
    }

    public Agencia buscarAgencia(String nomeAgencia) {

        for (Agencia a: this.agencias) {
            if(a.getNome().equals(nomeAgencia)) {
                return a;
            }
        }

        return null;
    }

    public Cliente buscarCliente(String nomeCliente, Agencia agencia) {
        return agencia.buscarCliente(nomeCliente);
    }

    public boolean listarClientes(String nomeAgencia, Boolean imprimeTransacao) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        List<Cliente> clientes = agencia.getClientes();

        int index = 1;
        for (Cliente c: clientes) {
            System.out.println("Cliente: " + c.getNome() + " [" + index + "]");

            int transacaoIndex = 1;
            for (double transacao: c.getTransacoes()) {
                System.out.printf(" [" + transacaoIndex + "] valor ");
                System.out.printf(Locale.FRANCE,"%.2f \n", transacao);
                transacaoIndex++;
            }

            index++;
        }

        //System.out.println(agencia.buscarCliente());

        return true;
    }
}
