import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        // Se o resto da divisão por 2 for zero, o número é par
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }

        leitor.close();
    }
}
