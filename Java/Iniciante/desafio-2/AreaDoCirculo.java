package me.dodopredo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaDoCirculo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double area = 0;
        double raio = 0;
        double n = 3.14159;
        raio = Double.valueOf(reader.readLine());
        area = n * (Math.pow(raio, 2));
        System.out.println(String.format("A=%.4f", area));
    }
}
