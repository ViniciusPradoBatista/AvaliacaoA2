package prova;

public abstract class LogDecorator implements Log {
    protected Log logDecorado;

    public LogDecorator(Log logDecorado) {
        this.logDecorado = logDecorado;
    }

    @Override
    public void registrarMensagem(Mensagem mensagem) {
        logDecorado.registrarMensagem(mensagem);
    }
}