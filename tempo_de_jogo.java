import java.io.IOException;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws IOException {
 
        Scanner leitor = new Scanner(System.in);

        int horaInicial = leitor.nextInt();
        int horaFinal = leitor.nextInt();

        if (horaInicial > horaFinal) {
            System.out.println("O JOGO DUROU " + (24 - (horaInicial - horaFinal)) + " HORA(S)");
        } else if (horaFinal > horaInicial) {
            System.out.println("O JOGO DUROU " + (horaFinal - horaInicial) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        leitor.close();
    }
}
