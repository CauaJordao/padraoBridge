package bridge;

public class Reserva extends Notificacao {

    public Reserva(String conteudo) {
        super(conteudo);
    }

    @Override
    public String mostrarConteudo() {
        return "[RESERVA]: " + this.conteudo;
    }
}
