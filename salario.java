import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
 
        Scanner leitor = new Scanner(System.in);

        int numero = leitor.nextInt();
        int horas = leitor.nextInt();
        double valorHora = leitor.nextDouble();

        double salario = horas * valorHora;

        System.out.println("NUMBER = " + numero);
        System.out.println(String.format("SALARY = U$ %.2f", salario));

        leitor.close();
    }
}
