import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner teclado = new Scanner(System.in);
       
       double raio = teclado.nextDouble();
       
       double area = 3.14159 * (raio * raio);
       
       System.out.println(String.format("A=%.4f", area)); 
       
       teclado.close();
    }
 
}
