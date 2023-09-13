package me.dodopredo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SalarioComBonus {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nome = reader.readLine();
        double salario = Double.valueOf(reader.readLine());
        double totalVendas = Double.valueOf(reader.readLine());
        double comissao = totalVendas * 0.15;
        System.out.println(String.format("TOTAL = R$ %.2f", salario + comissao));

    }
}
