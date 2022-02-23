import java.util.Locale;
import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {
    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return String.format(Locale.FRANCE,"%s %s %s %s %s %f", "[" + codigo + "]", nome, cargo, idade, "R$", salario);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return codigo == pessoa.codigo && idade == pessoa.idade && Double.compare(pessoa.salario, salario) == 0 && Objects.equals(nome, pessoa.nome) && Objects.equals(cargo, pessoa.cargo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome, cargo, idade, salario);
    }

    @Override
    public int compareTo(Pessoa o) {

        if(this.cargo.compareTo(o.getCargo()) == 0) {
            return 1;
        }
        return this.cargo.compareTo(o.getCargo());
    }
}
