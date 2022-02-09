public class Email implements CanalNotificacao {
    public Email() {
    }

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.printf("[EMAIL] {" + mensagem.getTipoMensagem() + "} - " + mensagem.getTexto() + "\n");
    }
}
