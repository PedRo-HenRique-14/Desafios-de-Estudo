package me.dodopredo;

import java.io.IOException;
import java.util.Scanner;

public class FormulaDeBhaskara {
    public static void main(String[] args) throws IOException {
        double a, b, c, r1, r2, delta;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        if (a == 0){
            System.out.println("Impossivel calcular");
            return;
        }
        delta = Math.pow(b, 2) -4 * a * c;
        if (delta < 0){
            System.out.println("Impossivel calcular");
            return;
        }
        r1 = (-b + Math.sqrt(delta)) / (2 * a);
        r2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println(String.format("R1 = %.5f\n" +
                "R2 = %.5f", r1, r2));
    }
}
