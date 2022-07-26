public class Pessoa {
    public static boolean emailValid(String email) {
        int TAMANHO_MAXIMO = 50;

        boolean contemArroba = email.contains("@");
        boolean tamanhoValido = email.length() <= TAMANHO_MAXIMO;

        return contemArroba && tamanhoValido;
    }
}