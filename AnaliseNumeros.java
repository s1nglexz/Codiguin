import java.util.ArrayList;
import java.util.Scanner;

public class AnaliseNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Double> listaNumeros = new ArrayList<>();

        System.out.print("Quantos números você deseja digitar? ");
        int n = leitor.nextInt();

        // Lendo os N números e guardando na lista
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double num = leitor.nextDouble();
            listaNumeros.add(num);
        }

        // Verificando se a lista não está vazia para evitar erros
        if (!listaNumeros.isEmpty()) {
            double maior = listaNumeros.get(0);
            double menor = listaNumeros.get(0);
            double soma = 0;

            for (double num : listaNumeros) {
                if (num > maior) maior = num;
                if (num < menor) menor = num;
                soma += num;
            }

            double media = soma / n;

            System.out.println("\n--- Resultados ---");
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
            System.out.println("Média: " + media);
        }

        leitor.close();
    }
}