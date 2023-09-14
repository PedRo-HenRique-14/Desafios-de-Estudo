package me.dodopredo;

import java.io.IOException;
import java.util.Scanner;

/*
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles,
mostrando 4 casas decimais após a vírgula
 */
public class DistanciaEntreDoisPontos {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(String.format("%.4f", distancia));

    }
}
