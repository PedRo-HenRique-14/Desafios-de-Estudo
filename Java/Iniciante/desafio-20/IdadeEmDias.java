package me.dodopredo;

import java.io.IOException;
import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] arg) throws IOException {
        int anos, meses, dias;
        int tempoEmDias;
        Scanner scanner = new Scanner(System.in);
        tempoEmDias = scanner.nextInt();
        anos = tempoEmDias / 365;
        dias = tempoEmDias % 365;
        meses = dias / 30;
        dias %= 30;
        System.out.println(String.format("%s ano(s)\n%s mes(es)\n%s dia(s)", anos, meses, dias));
    }
}
