import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = leitor.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        // O laço for começa em 1 e vai até 10
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        leitor.close();
    }
}