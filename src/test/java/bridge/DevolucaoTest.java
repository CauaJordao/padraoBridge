package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DevolucaoTest {

    @Test
    void deveMostrarConteudoComoDevolucao() {
        Devolucao devolucao = new Devolucao("A devolução do livro vence amanhã.");
        assertEquals("[DEVOLUÇÃO]: A devolução do livro vence amanhã.", devolucao.mostrarConteudo());
    }

    @Test
    void deveDispararViaCanalSMS() {
        Devolucao devolucao = new Devolucao("A devolução do livro vence amanhã.");
        devolucao.setCanalEnvio(new CanalSMS());
        assertTrue(devolucao.disparar());
    }
}
