package prova;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogComDataHora extends LogDecorator {
    public LogComDataHora(Log logDecorado) {
        super(logDecorado);
    }

    @Override
    public void registrarMensagem(Mensagem mensagem) {
        String conteudoComDataHora = "[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "] " + mensagem.getConteudo();
        mensagem.setConteudo(conteudoComDataHora);
        super.registrarMensagem(mensagem);
    }
}
