package bridge;

public class CanalEmail implements CanalEnvio {
    @Override
    public boolean enviar(String conteudo) {
        System.out.println("Enviando E-mail... | " + conteudo);
        return true;
    }
}
