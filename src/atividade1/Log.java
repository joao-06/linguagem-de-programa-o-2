public class Log {
    private String acao;
    private String informacao;

    public Log(String acao, String informacao) {
        this.acao = acao;
        this.informacao = informacao;
    }
    public void printLog() {
        System.out.println(acao + ": " + informacao);
    } 
}
