package me.dodopredo;

import java.io.IOException;
import java.util.Scanner;

public class NotasEMoedas {
    public static void main(String[] args) throws IOException {
        int notaCem, notaCinquenta, notaVinte, notaDez, notaCinco, notaDois, moedaCem;
        int moedaCinquenta, moedaVinteCinco, moedaDez, moedaCinco, moedaUm, resto;
        Double valorTotal;
        Scanner scanner = new Scanner(System.in);
        valorTotal = scanner.nextDouble();
        valorTotal *= 100;
        notaCem = valorTotal.intValue() / 10000;
        resto = valorTotal.intValue() % 10000;
        notaCinquenta = resto / 5000;
        resto %= 5000;
        notaVinte = resto / 2000;
        resto %= 2000;
        notaDez = resto / 1000;
        resto %= 1000;
        notaCinco = resto / 500;
        resto %= 500;
        notaDois = resto / 200;
        resto %= 200;
        moedaCem = resto / 100;
        resto %= 100;
        moedaCinquenta = resto / 50;
        resto %= 50;
        moedaVinteCinco = resto / 25;
        resto %= 25;
        moedaDez = resto / 10;
        resto %= 10;
        moedaCinco = resto / 5;
        moedaUm = resto % 5;
        System.out.println(String.format("NOTAS:\n" +
                "%s nota(s) de R$ 100.00\n" +
                "%s nota(s) de R$ 50.00\n" +
                "%s nota(s) de R$ 20.00\n" +
                "%s nota(s) de R$ 10.00\n" +
                "%s nota(s) de R$ 5.00\n" +
                "%s nota(s) de R$ 2.00\n" +
                "MOEDAS:\n" +
                "%s moeda(s) de R$ 1.00\n" +
                "%s moeda(s) de R$ 0.50\n" +
                "%s moeda(s) de R$ 0.25\n" +
                "%s moeda(s) de R$ 0.10\n" +
                "%s moeda(s) de R$ 0.05\n" +
                "%s moeda(s) de R$ 0.01", notaCem, notaCinquenta, notaVinte, notaDez, notaCinco, notaDois, moedaCem, moedaCinquenta, moedaVinteCinco, moedaDez, moedaCinco, moedaUm));
    }
}
