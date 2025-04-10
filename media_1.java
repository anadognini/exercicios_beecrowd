import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner teclado = new Scanner(System.in);
        
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        
        double media = ((A * 3.5) + (B * 7.5)) / 11;
        
        System.out.println(String.format("MEDIA = %.5f", media));
         
        teclado.close();
 
    }
}
