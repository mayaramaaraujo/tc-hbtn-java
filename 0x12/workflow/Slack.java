public class Slack implements CanalNotificacao{
    public Slack() {
    }

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.printf("[SLACK] {" + mensagem.getTipoMensagem() + "} - " + mensagem.getTexto() + "\n");
    }
}
