package prova;

public class LogEncriptado extends LogDecorator {
    public LogEncriptado(Log logDecorado) {
        super(logDecorado);
    }

    @Override
    public void registrarMensagem(Mensagem mensagem) {
        String mensagemEncriptada = new StringBuilder(mensagem.getConteudo()).reverse().toString();
        mensagem.setConteudo("Mensagem encriptada: " + mensagemEncriptada);
        super.registrarMensagem(mensagem);
    }
}