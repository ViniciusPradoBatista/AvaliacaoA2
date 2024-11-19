package prova;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogParaArquivo extends LogDecorator {
    private String caminhoArquivo;

    public LogParaArquivo(Log logDecorado, String caminhoArquivo) {
        super(logDecorado);
        this.caminhoArquivo = caminhoArquivo;
    }

    @Override
    public void registrarMensagem(Mensagem mensagem) {
        super.registrarMensagem(mensagem);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {
            writer.write(mensagem.getConteudo());
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
