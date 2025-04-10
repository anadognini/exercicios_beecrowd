import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();

        if (a < b && a < b) {
			System.out.println(a);
			if (b < c) {
				System.out.println(b);
				System.out.println(c);
			} else {
				System.out.println(c);
				System.out.println(b);
			}
		} else if (b < c) {
			System.out.println(b);
			if (a < c) {
				System.out.println(a);
				System.out.println(c);
			} else {
				System.out.println(c);
				System.out.println(a);
			}
		} else {
			System.out.println(c);
			if (a < b) {
				System.out.println(a);
				System.out.println(b);
			} else {
				System.out.println(b);
				System.out.println(a);
			}
		}

        System.out.println("");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

        leitor.close();
    }
}
