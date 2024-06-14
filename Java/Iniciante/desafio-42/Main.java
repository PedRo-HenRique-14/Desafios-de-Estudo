import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3, x, a, b, c;
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();
        scanner.close();
        a = n1;
        b = n2;
        c = n3;
        if (n1 > n2) {
            x = n2;
            n2 = n1;
            n1 = x;
        }
        if (n1 > n3) {
            x = n3;
            n3 = n1;
            n1 = x;
        }

        if (n2 > n3) {
            x = n3;
            n3 = n2;
            n2 = x;
        }

        System.out.println(String.format("%s\n%s\n%s\n", n1, n2, n3));
        System.out.println(String.format("%s\n%s\n%s", a, b, c));
 
    }
 
}