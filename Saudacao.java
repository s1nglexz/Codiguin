import java.util.Scanner; // Importa a classe para ler a entrada do teclado

public class Saudacao {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler o que o usuário digita
        Scanner leitor = new Scanner(System.in);

        // Exibe uma mensagem solicitando o nome
        System.out.print("Digite o seu nome: ");

        // Lê a linha digitada pelo usuário
        String nome = leitor.nextLine();

        // Exibe a saudação personalizada
        System.out.println("Olá, " + nome + "! Seja bem-vindo.");

        // Fecha o leitor para boa prática
        leitor.close();
    }
}
