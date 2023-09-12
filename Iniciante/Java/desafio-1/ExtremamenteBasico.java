package me.dodopredo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExtremamenteBasico {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.valueOf(bufferedReader.readLine());
        int b = Integer.valueOf(bufferedReader.readLine());
        int x = a + b;
        System.out.println("x = " + x);

    }
}
