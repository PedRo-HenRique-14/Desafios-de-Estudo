package me.dodopredo;

import java.io.IOException;
import java.util.Scanner;

/*
Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).
 */
public class Consumo {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        double distanciaTotal = scanner.nextDouble();
        double combustivelGasto = scanner.nextDouble();
        double consumoMedio = distanciaTotal / combustivelGasto;
        System.out.println(String.format("%.3f km/l", consumoMedio));

    }
}
