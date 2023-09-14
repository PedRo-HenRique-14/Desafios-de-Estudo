package me.dodopredo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
(a+b+abs(a-b)) / 2

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.
 */
public class OMaior {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        final int a = Integer.valueOf(input[0]);
        final int b = Integer.valueOf(input[1]);
        final int c = Integer.valueOf(input[2]);
        int maior = (a+b+Math.abs(a-b)) / 2;
        maior = (maior+c+Math.abs(maior-c)) / 2;
        System.out.println(String.format("%s eh o maior", maior));

    }
}
