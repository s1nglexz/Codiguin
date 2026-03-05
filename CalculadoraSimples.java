import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🧮 Calculadora Simples");
        System.out.println("Escolha a operação:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Sua escolha: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

        // Equivalente ao if/elif do Python
        if (opcao == 1) {
            resultado = somar(num1, num2);
        } else if (opcao == 2) {
            resultado = subtrair(num1, num2);
        } else if (opcao == 3) {
            resultado = multiplicar(num1, num2);
        } else if (opcao == 4) {
            // Tratamento extra para evitar que a divisão por zero quebre o programa
            if (num2 == 0) {
                System.out.println("Erro: Não é possível dividir um número por zero!");
                operacaoValida = false;
            } else {
                resultado = dividir(num1, num2);
            }
        } else {
            System.out.println("Opção inválida!");
            operacaoValida = false;
        }

        // Só exibe o resultado se a operação for válida e não for divisão por zero
        if (operacaoValida) {
            System.out.println("O resultado da operação é: " + resultado);
        }

        scanner.close();
    }

    // Nossas funções (métodos em Java) equivalentes ao "def"
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}