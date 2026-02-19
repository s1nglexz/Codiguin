import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Solicita o primeiro número
        System.out.print("Digite o primeiro número: ");
        double num1 = leitor.nextDouble(); // Lê um número decimal ou inteiro

        // Solicita o segundo número
        System.out.print("Digite o segundo número: ");
        double num2 = leitor.nextDouble();

        // Realiza o cálculo
        double resultado = num1 + num2;

        // Exibe o resultado
        System.out.println("A soma de " + num1 + " + " + num2 + " é: " + resultado);

        leitor.close();
    }
}