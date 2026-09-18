package bridge;

public class Devolucao extends Notificacao {

    public Devolucao(String conteudo) {
        super(conteudo);
    }

    @Override
    public String mostrarConteudo() {
        return "[DEVOLUÇÃO]: " + this.conteudo;
    }
}
