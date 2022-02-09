public class Teams implements CanalNotificacao {
    @Override
    public void notificar(Mensagem mensagem) {
        System.out.printf("[TEAMS] {" + mensagem.getTipoMensagem() + "} - " + mensagem.getTexto() + "\n");
    }
}
