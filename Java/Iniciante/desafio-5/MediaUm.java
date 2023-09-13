package me.dodopredo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MediaUm {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.valueOf(reader.readLine()) * 3.5;
        double b = Double.valueOf(reader.readLine()) * 7.5;
        double media = (a + b) / 11;
        System.out.println(String.format("MEDIA = %.5f", media));
    }
}
