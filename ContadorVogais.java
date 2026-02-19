import java.util.Scanner;

public class ContadorVogais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = leitor.nextLine();
        
        // Convertemos tudo para minúsculo para facilitar a comparação
        String fraseMinuscula = frase.toLowerCase();
        
        int contador = 0;

        // Percorre cada caractere da frase
        for (int i = 0; i < fraseMinuscula.length(); i++) {
            char letra = fraseMinuscula.charAt(i);

            // Verifica se o caractere é uma vogal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        System.out.println("A frase digitada contém " + contador + " vogais.");

        leitor.close();
    }
}