import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        double valorEntrada = leitor.nextDouble();
        int notas = (int) (valorEntrada);
        int moedas = (int) ((valorEntrada - notas) * 100);

        // Notas
        int notas100 = notas / 100;
        notas %= 100;

        int notas50 = notas / 50;
        notas %= 50;

        int notas20 = notas / 20;
        notas %= 20;

        int notas10 = notas / 10;
        notas %= 10;

        int notas5 = notas / 5;
        notas %= 5;

        int notas2 = notas / 2;
        notas %= 2;

        // Moedas
        int moedas1 = notas;
        notas %= 1;

        int moedas50 = moedas / 50;
        moedas %= 50;

        int moedas25 = moedas / 25;
        moedas %= 25;

        int moedas10 = moedas / 10;
        moedas %= 10;

        int moedas05 = moedas / 5;
        moedas %= 5;

        int moedas01 = moedas;

        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas50 + " moeda(s) de R$ 0.50");
        System.out.println(moedas25 + " moeda(s) de R$ 0.25");
        System.out.println(moedas10 + " moeda(s) de R$ 0.10");
        System.out.println(moedas05 + " moeda(s) de R$ 0.05");
        System.out.println(moedas01 + " moeda(s) de R$ 0.01");

        leitor.close();
    }

}
