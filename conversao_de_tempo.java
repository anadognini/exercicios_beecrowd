import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();

        int segundos = n % 60;
        int horas = n / 60;
        int minutos = horas % 60;
        horas = horas / 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        leitor.close();        
    }
}
