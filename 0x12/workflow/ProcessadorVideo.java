import java.util.ArrayList;

public class ProcessadorVideo {
    private ArrayList<CanalNotificacao> canais;

    public ProcessadorVideo() {
        this.canais = new ArrayList<>();
    }

    public void registrarCanal(CanalNotificacao canal) {
       canais.add(canal);
    }

    public void processar(Video video) {
        String mensagemVideo = video.getArquivo() + " - " + video.getFormato();

        Mensagem mensagem = new Mensagem(mensagemVideo, TipoMensagem.LOG);

        for (CanalNotificacao canal:this.canais) {
            canal.notificar(mensagem);
            //System.out.printf(video.getArquivo() + " - " + video.getFormato() + "\n");
        }
    }
}
