package bridge;

public abstract class Notificacao {

    protected CanalEnvio canalEnvio;
    protected String conteudo;

    public Notificacao(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setCanalEnvio(CanalEnvio canalEnvio) {
        this.canalEnvio = canalEnvio;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public abstract String mostrarConteudo();

    public boolean disparar() {
        if (this.canalEnvio == null) {
            throw new IllegalStateException("Canal de envio não configurado.");
        }
        return this.canalEnvio.enviar(this.mostrarConteudo());
    }
}
