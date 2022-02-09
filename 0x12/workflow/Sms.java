public class Sms implements CanalNotificacao {

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.printf("[SMS] {" + mensagem.getTipoMensagem() + "} - " + mensagem.getTexto() + "\n");
    }

}
