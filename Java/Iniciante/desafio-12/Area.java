package me.dodopredo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */
public class Area {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        double a = Double.valueOf(input[0]);
        double b = Double.valueOf(input[1]);
        double c = Double.valueOf(input[2]);
        double areaTrianguloRetangulo = a * c / 2;
        double areaCirculo = Math.pow(c, 2) * 3.14159;
        double areaTrapezio = (a + b) * c / 2;
        double areaQuadrado = Math.pow(b, 2);
        double areaRetangulo = a * b;
        System.out.println(String.format("TRIANGULO: %.3f\n" +
                "CIRCULO: %.3f\n" +
                "TRAPEZIO: %.3f\n" +
                "QUADRADO: %.3f\n" +
                "RETANGULO: %.3f", areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo));

    }
}
