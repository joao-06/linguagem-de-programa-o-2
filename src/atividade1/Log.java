import java.time.LocalDateTime;

public class Log {
    private String usuario;
    private String acao;
    private LocalDateTime data;
    private LocalDateTime hora;

    public Log(String usuario, String acao) {
        this.usuario = usuario;
        this.acao = acao;
        this.data = LocalDateTime.now();
        this.hora = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return Log ["Usuario=" + usuario + , "Acao=" + acao + , "Data=" + data + , "Hora=" +hora+];
    }

    // Getters e Setters (opcionais)
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setDataHora(LocalDateTime data) {
        this.dataHora = data;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setDataHora(LocalDateTime hora) {
        this.dataHora = hora;
}
