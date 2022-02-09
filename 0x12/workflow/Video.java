public class Video {
    private String arquivo;
    private FormatoVideo formato;

    public Video(String arquivo, FormatoVideo formato) {
        this.arquivo = arquivo;
        this.formato = formato;
    }

    public String getArquivo() {
        return arquivo;
    }

    public FormatoVideo getFormato() {
        return formato;
    }
}
