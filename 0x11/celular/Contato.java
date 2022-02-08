public class Contato {
    private String nome;
    private String numeroDeTelefone;
    private TipoNumero tipoNumero;

    public Contato(String nome, String numeroDeTelefone, TipoNumero tipoNumero) {
        this.nome = nome;
        this.numeroDeTelefone = numeroDeTelefone;
        this.tipoNumero = tipoNumero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public TipoNumero getTipoNumero() {
        return tipoNumero;
    }

    @Override
    public String toString() {
        return nome + " -> " + numeroDeTelefone + " (" + tipoNumero + ")";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroDeTelefone(String numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public void setTipoNumero(TipoNumero tipoNumero) {
        this.tipoNumero = tipoNumero;
    }
}
