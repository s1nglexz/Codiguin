import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // random.nextInt(100) gera de 0 a 99. Somamos 1 para ficar de 1 a 100.
        int numeroSecreto = random.nextInt(100) + 1;
        int palpite = 0;
        int tentativas = 0;
        
        System.out.println("🎯 Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Eu escolhi um número entre 1 e 100. Tente adivinhar!");
        
        // Loop que continua até o usuário acertar o número
        while (palpite != numeroSecreto) {
            System.out.print("\nDigite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++; // Contador de tentativas
            
            if (palpite < numeroSecreto) {
                System.out.println("Dica: O número secreto é MAIOR.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Dica: O número secreto é MENOR.");
            } else {
                System.out.println("🎉 Parabéns! Você acertou o número " + numeroSecreto + "!");
                System.out.println("Total de tentativas: " + tentativas);
            }
        }
        
        scanner.close();
    }
}