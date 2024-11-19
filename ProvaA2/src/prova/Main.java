package prova;

public class Main {
    public static void main(String[] args) {
        Log log = new LogBasico();

        log = new LogComDataHora(log);
        log = new LogEncriptado(log);
        log = new LogParaArquivo(log, "logs.txt");

        Mensagem mensagem1 = new Mensagem("Erro ao conectar ao servidor");
        Mensagem mensagem2 = new Mensagem("Operação realizada com sucesso");
        Mensagem mensagem3 = new Mensagem("Enviado com sucesso - Vinicius");

        log.registrarMensagem(mensagem1);
        log.registrarMensagem(mensagem2);
        log.registrarMensagem(mensagem3);
    }
}