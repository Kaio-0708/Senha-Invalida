import java.util.Scanner;

public class ExercicioSenha {

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua senha");
        String senha = scanner.nextLine();

        try{
            validarSenha(senha);
            System.out.println("Senha válida. Acesso permitido.");
        } catch (SenhaInvalidaException e){
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();}
    }

    private static void validarSenha(String senha) {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres.");
        }
    }
}
