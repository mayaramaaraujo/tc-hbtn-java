import java.io.Serializable;

public class Estudante implements Serializable {

    private String nome;
    private int idade;

    public Estudante(int idade, String nome) {
        this.nome = nome;
        this.idade = idade;
    }

    private String senha;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "Estudante { nome='" + nome + "', idade='" + idade + "', senha='" + senha + "' }";
    }
}
