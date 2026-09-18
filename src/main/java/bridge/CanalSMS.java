package bridge;

public class CanalSMS implements CanalEnvio {
    @Override
    public boolean enviar(String conteudo) {
        System.out.println("Enviando SMS... | " + conteudo);
        return true;
    }
}
