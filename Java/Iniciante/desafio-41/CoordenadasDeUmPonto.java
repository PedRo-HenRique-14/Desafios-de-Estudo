import java.io.IOException;
import java.util.Scanner;

/*
 * Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
 */

public class CoordenadasDeUmPonto {
    
    public static void main(String[] args) throws IOException {
        
        double x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        scanner.close();
        if (x + y != 0) {
            if (x == 0) {
                System.out.println("Eixo Y");
            } else if (y == 0) {
                System.out.println("Eixo X");
            } else {
                if (y > 0 && x > 0) {
                    System.out.println("Q1");
                } else if (y < 0 && x > 0) {
                    System.out.println("Q4");
                } else if (y < 0 && x < 0) {
                    System.out.println("Q3");
                } else {
                    System.out.println("Q2");
                }
            }
        } else {
            System.out.println("Origem");
        }

    }

}
