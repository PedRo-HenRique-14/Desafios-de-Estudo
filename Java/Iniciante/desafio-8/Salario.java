package me.dodopredo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Salario {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.valueOf(reader.readLine());
        int tempoTrabalho = Integer.valueOf(reader.readLine());
        double salarioPorHora = Double.valueOf(reader.readLine());
        double salary = tempoTrabalho * salarioPorHora;
        System.out.println(String.format("NUMBER = %s\nSALARY = U$ %.2f", number, salary));
    }
}
