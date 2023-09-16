package me.dodopredo;

import java.io.IOException;
import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int distanciaCarroY = scanner.nextInt();
        int distancia = distanciaCarroY * 2;
        System.out.println(distancia + " minutos");
    }
}
