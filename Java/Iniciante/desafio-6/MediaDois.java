package me.dodopredo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MediaDois {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.valueOf(reader.readLine()) * 2;
        double b = Double.valueOf(reader.readLine()) * 3;
        double c = Double.valueOf(reader.readLine()) * 5;
        double media = (a+b+c)/10;
        System.out.println(String.format("MEDIA = %.1f", media));

    }
}
