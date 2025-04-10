import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner teclado = new Scanner(System.in);
        
        int valor1 = teclado.nextInt();
        int valor2 = teclado.nextInt();
        
        int PROD = valor1 * valor2;
        
        System.out.println("PROD = " + PROD);
        teclado.close();
    }
}
