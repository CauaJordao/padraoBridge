package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmprestimoTest {

    @Test
    void deveMostrarConteudoComoEmprestimo() {
        Emprestimo emprestimo = new Emprestimo("O livro Clean Code foi emprestado com sucesso.");
        assertEquals("[EMPRÉSTIMO]: O livro Clean Code foi emprestado com sucesso.", emprestimo.mostrarConteudo());
    }

    @Test
    void deveDispararViaCanalEmail() {
        Emprestimo emprestimo = new Emprestimo("O livro Clean Code foi emprestado com sucesso.");
        emprestimo.setCanalEnvio(new CanalEmail());
        assertTrue(emprestimo.disparar());
    }
}
