import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner teclado = new Scanner(System.in);
        
        int A = teclado.nextInt();
        
        int B = teclado.nextInt();
        
        int X = A + B;
        
        System.out.println("X = " + X);
        
        teclado.close();
    }
 
}
