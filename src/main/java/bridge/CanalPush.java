package bridge;

public class CanalPush implements CanalEnvio {
    @Override
    public boolean enviar(String conteudo) {
        System.out.println("Enviando notificação Push... | " + conteudo);
        return true;
    }
}
