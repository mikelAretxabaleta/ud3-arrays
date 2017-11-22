package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        Random r = new Random();


        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];


        System.out.println("Matriz 1:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                matriz1[i][j] = r.nextInt(100);


                System.out.format("%6d", matriz1[i][j]);
            }
            System.out.println();
        }

        System.out.println("Matriz 2:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                matriz2[i][j] = r.nextInt(100);


                System.out.format("%6d", matriz2[i][j]);
            }
            System.out.println();
        }
        char opcion;

        do {
            System.out.println("1. La suma de las dos matrices.\n" +
                    "2. El producto de la primera por un escalar (se lo pediremos al usuario).\n" +
                    "3. El producto de las dos matrices.\n" +
                    "4. La traspuesta de la segunda matriz.\n" +
                    "5. Salir");
            System.out.print("Opción: ");
            opcion = br.readLine().charAt(0);

            switch (opcion) {
                case '1':
                    visualizarMatriz(suma(matriz1, matriz2));

                    break;

                case '2':
                    System.out.print("Escalar: ");
                    int escalar = Integer.parseInt(br.readLine());

                    visualizarMatriz(multiplicarEscalar(matriz1, escalar));

                    break;

                case '3':
                    visualizarMatriz(multiplicar(matriz1, matriz2));

                    break;

                case '4':
                    visualizarMatriz(traspuesta(matriz2));

                    break;


            }

        } while (opcion != '5');
    }

    private static int[][] traspuesta(int[][] matriz2) {
        int[][] matriz3 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz3[i][j] = matriz2[j][i];
            }
        }
        return matriz3;
    }

    private static int[][] multiplicar(int[][] matriz1, int[][] matriz2) {

        int[][] matriz3 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz3[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }
        return matriz3;
    }

    private static int[][] multiplicarEscalar(int[][] matriz1, int escalar) {
        int[][] matriz3 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz3[i][j] = matriz1[i][j] * escalar;
            }
        }
        return matriz3;
    }


    private static int[][] suma(int[][] matriz1, int[][] matriz2) {
        int[][] matriz3 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matriz3;
    }


    private static void visualizarMatriz(int[][] operacion) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.format("%6d", operacion[i][j]);
            }
            System.out.println();
        }

    }
}
