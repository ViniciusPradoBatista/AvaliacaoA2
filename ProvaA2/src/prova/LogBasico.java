package prova;

public class LogBasico implements Log {
    @Override
    public void registrarMensagem(Mensagem mensagem) {
        System.out.println("Log: " + mensagem.getConteudo());
    }
}