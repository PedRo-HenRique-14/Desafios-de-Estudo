package me.dodopredo;

import java.io.IOException;
import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int tempoViagem = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();
        double distancia = velocidadeMedia * tempoViagem;
        double litrosNecessarios = distancia / 12;
        System.out.println(String.format("%.3f", litrosNecessarios));
    }
}
