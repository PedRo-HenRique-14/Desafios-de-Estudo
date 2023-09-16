package me.dodopredo;

import java.io.IOException;
import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) throws IOException {
        int dinheiroTotal, resto, notaCem, notaCinquenta, notaVinte, notaDez, notaCinco, notaDois, notaUm;
        Scanner scanner = new Scanner(System.in);
        dinheiroTotal = scanner.nextInt();
        notaCem = dinheiroTotal / 100;
        resto = dinheiroTotal % 100;
        notaCinquenta = resto / 50;
        resto = resto % 50;
        notaVinte = resto / 20;
        resto = resto %20;
        notaDez = resto / 10;
        resto = resto % 10;
        notaCinco = resto / 5;
        resto = resto % 5;
        notaDois = resto / 2;
        resto = resto % 2;
        notaUm = resto / 1;
        System.out.println(String.format("%s", dinheiroTotal));
        System.out.println(String.format("%s nota(s) de R$ 100,00", notaCem));
        System.out.println(String.format("%s nota(s) de R$ 50,00", notaCinquenta));
        System.out.println(String.format("%s nota(s) de R$ 20,00", notaVinte));
        System.out.println(String.format("%s nota(s) de R$ 10,00", notaDez));
        System.out.println(String.format("%s nota(s) de R$ 5,00", notaCinco));
        System.out.println(String.format("%s nota(s) de R$ 2,00", notaDois));
        System.out.println(String.format("%s nota(s) de R$ 1,00", notaUm));
    }
}
