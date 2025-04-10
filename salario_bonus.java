import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        String nome = leitor.nextLine();
        double salarioFixo = leitor.nextDouble();
        double totalVendas = leitor.nextDouble();

        double total = salarioFixo + totalVendas * 0.15;

        System.out.println("TOTAL = R$ " + df.format(total));

        leitor.close();
    }
}
