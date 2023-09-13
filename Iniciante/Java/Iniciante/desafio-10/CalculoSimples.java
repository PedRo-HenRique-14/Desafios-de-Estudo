package me.dodopredo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculoSimples {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] produto1 = reader.readLine().split(" ");
        String[] produto2 = reader.readLine().split(" ");
        double totalPagar = Integer.valueOf(produto1[1])*Double.valueOf(produto1[2]) + Integer.valueOf(produto2[1])*Double.valueOf(produto2[2]);
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", totalPagar));

    }
}
