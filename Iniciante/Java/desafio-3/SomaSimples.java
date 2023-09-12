package me.dodopredo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SomaSimples {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(reader.readLine());
        int b = Integer.valueOf(reader.readLine());
        int soma = a+b;
        System.out.println("SOMA = "+soma);
    }
}
