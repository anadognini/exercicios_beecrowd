import java.io.IOException;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws IOException {
 
       Scanner leitor = new Scanner(System.in);

       int distancia = leitor.nextInt();
       int tempo = (60 * distancia) / 30;

       System.out.println(tempo + " minutos");

       leitor.close();
    }
}
