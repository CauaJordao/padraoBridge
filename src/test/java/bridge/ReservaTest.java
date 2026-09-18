package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReservaTest {

    @Test
    void deveMostrarConteudoComoReserva() {
        Reserva reserva = new Reserva("O livro reservado já está disponível para retirada.");
        assertEquals("[RESERVA]: O livro reservado já está disponível para retirada.", reserva.mostrarConteudo());
    }

    @Test
    void deveDispararViaCanalPush() {
        Reserva reserva = new Reserva("O livro reservado já está disponível para retirada.");
        reserva.setCanalEnvio(new CanalPush());
        assertTrue(reserva.disparar());
    }
}
