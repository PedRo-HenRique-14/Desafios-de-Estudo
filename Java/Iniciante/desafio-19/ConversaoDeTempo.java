package me.dodopredo;

import java.io.IOException;
import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args) throws IOException {
        int tempoSegundos, horas, minutos, segundos;
        Scanner scanner = new Scanner(System.in);
        tempoSegundos = scanner.nextInt();
        horas = tempoSegundos / 3600;
        segundos = tempoSegundos % 3600;
        minutos = segundos / 60;
        segundos %= 60;
        System.out.println(String.format("%s:%s:%s", horas, minutos, segundos));
    }
}
