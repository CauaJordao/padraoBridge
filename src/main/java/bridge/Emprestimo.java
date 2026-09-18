package bridge;

public class Emprestimo extends Notificacao {

    public Emprestimo(String conteudo) {
        super(conteudo);
    }

    @Override
    public String mostrarConteudo() {
        return "[EMPRÉSTIMO]: " + this.conteudo;
    }
}
