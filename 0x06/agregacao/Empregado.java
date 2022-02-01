public class Empregado {
    private String nome;
    private int codigo;
    private Endereco endereco;

    public Empregado(String nome, int codigo, Endereco endereco) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void apresentar() {
        System.out.printf(
                "Codigo: " + this.getCodigo() + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "Bairro: " + endereco.getBairro() + "\n" +
                "Cidade: " + endereco.getCidade() + "\n" +
                "Pais: " + endereco.getPais()
        );
    }
}
