package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] tablero = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                tablero[i][j] = 9;
            }


        }
        visualizarTablero(tablero);

        int turno = 0;
        int tiradas = 0;

        do {

            System.out.print("Columna: ");
            int columna = Integer.parseInt(br.readLine());

            System.out.print("Fila: ");
            int fila = Integer.parseInt(br.readLine());

            if (tablero[fila][columna] == 9) {
                if (turno == 0) tablero[fila][columna] = 0;
                else tablero[fila][columna] = 1;

                if (turno == 0) turno++;
                else turno--;

                tiradas++;
                hayGanador(tablero);
            }
            visualizarTablero(tablero);





        } while (!hayGanador(tablero) && tiradas < 9);
        if (hayGanador(tablero)) System.out.println("Has ganado !!!!!");
        else System.out.println("Empate!!!!");
    }

    private static boolean hayGanador(int[][] tablero) {
        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < 3; i++) {


                if (tablero[0][i] == k && tablero[1][i] == k && tablero[2][i] == k) return true;
                if (tablero[i][0] == k && tablero[i][1] == k && tablero[i][2] == k) return true;

            }
            if (tablero[0][0] == k && tablero[1][1] == k && tablero[2][2] == k) return true;
            if (tablero[0][2] == k && tablero[1][1] == k && tablero[2][0] == k) return true;

        }
        return false;

    }

    private static void visualizarTablero(int[][] tablero) {

        String x="X";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (tablero[i][j]==9) System.out.format("%4s",x);
                else System.out.format("%4d", tablero[i][j]);

            }
            System.out.println();
        }

    }
}
