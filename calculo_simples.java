import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner leitor = new Scanner(System.in);

        int codigo1 = leitor.nextInt();
        int qtde1 = leitor.nextInt();
        double valor1 = leitor.nextDouble();
        int codigo2 = leitor.nextInt();
        int qtde2 = leitor.nextInt();
        double valor2 = leitor.nextDouble();

        double custoTotal = qtde1 * valor1 + qtde2 * valor2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", custoTotal);

        leitor.close();
 
    }
}
