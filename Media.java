import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Solicita os três números
        System.out.print("Digite o primeiro número: ");
        double n1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = leitor.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double n3 = leitor.nextDouble();

        // Calcula a média
        // Usamos parênteses para garantir que a soma ocorra antes da divisão
        double media = (n1 + n2 + n3) / 3;

        // Exibe o resultado formatado
        System.out.println("A média aritmética dos números é: " + media);

        leitor.close();
    }
}