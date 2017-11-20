package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int[][] matriz=new int[10][10];

        Random r=new Random();

        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10 ; j++) {

            matriz[i][j]=r.nextInt(101);
            }}

        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <10 ; j++) {

                System.out.format("%5d", matriz[i][j]);

            }
            System.out.println();
        }

    }
}
