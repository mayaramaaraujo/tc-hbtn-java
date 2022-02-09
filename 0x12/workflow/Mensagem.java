public class Mensagem {
    private String texto;
    private TipoMensagem tipoMensagem;

    public Mensagem(String texto, TipoMensagem tipoMensagem) {
        this.texto = texto;
        this.tipoMensagem = tipoMensagem;
    }

    public String getTexto() {
        return texto;
    }

    public TipoMensagem getTipoMensagem() {
        return tipoMensagem;
    }
}
