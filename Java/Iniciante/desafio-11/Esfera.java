package me.dodopredo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R).
A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.

Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++),
assumem que o resultado da divisão entre dois inteiros é outro inteiro.
 */
public class Esfera {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final double pi = 3.14159;
        double raio = Double.valueOf(reader.readLine());
        double volume = 4 * pi * Math.pow(raio, 3) / 3;
        System.out.println(String.format("VOLUME = %.3f", volume));

    }
}
