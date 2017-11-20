package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int HORAS = 3;
        double[] temp = new double[HORAS];
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double media;
        double total = 0;


        for (int i = 0; i < HORAS; i++) {
            System.out.print("Temperatura " + i + " : ");
            temp[i] = Double.parseDouble(br.readLine());
            if (temp[i] < min) min = temp[i];
            if (temp[i] > max) max = temp[i];
            total += temp[i];
        }
        media = total / HORAS;

        for (int i = 0; i < HORAS; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < temp[i]; j++) {
                System.out.print("*");
            }
            System.out.print(" " + temp[i]);
            if (temp[i] == min) System.out.print(" --> MIN");
            if (temp[i] == max) System.out.print(" --> MAX");
            System.out.println();
        }
        System.out.println("Media: " + media);
    }
}
