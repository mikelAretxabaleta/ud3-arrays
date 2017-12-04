package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.awt.Color.blue;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] tablero=new int[9][9];
        tablero[0][0]=5;
        tablero[0][1]=3;
        tablero[0][2]=0;
        tablero[0][3]=0;
        tablero[0][4]=7;
        tablero[0][5]=0;
        tablero[0][6]=0;
        tablero[0][7]=0;
        tablero[0][8]=0;

        tablero[1][0]=6;
        tablero[1][1]=0;
        tablero[1][2]=0;
        tablero[1][3]=1;
        tablero[1][4]=9;
        tablero[1][5]=5;
        tablero[1][6]=0;
        tablero[1][7]=0;
        tablero[1][8]=0;

        tablero[2][0]=0;
        tablero[2][1]=9;
        tablero[2][2]=8;
        tablero[2][3]=0;
        tablero[2][4]=0;
        tablero[2][5]=0;
        tablero[2][6]=0;
        tablero[2][7]=6;
        tablero[2][8]=0;

        tablero[3][0]=8;
        tablero[3][1]=0;
        tablero[3][2]=0;
        tablero[3][3]=0;
        tablero[3][4]=6;
        tablero[3][5]=0;
        tablero[3][6]=0;
        tablero[3][7]=0;
        tablero[3][8]=3;

        tablero[4][0]=4;
        tablero[4][1]=0;
        tablero[4][2]=0;
        tablero[4][3]=8;
        tablero[4][4]=0;
        tablero[4][5]=3;
        tablero[4][6]=0;
        tablero[4][7]=0;
        tablero[4][8]=1;

        tablero[5][0]=7;
        tablero[5][1]=0;
        tablero[5][2]=0;
        tablero[5][3]=0;
        tablero[5][4]=2;
        tablero[5][5]=0;
        tablero[5][6]=0;
        tablero[5][7]=0;
        tablero[5][8]=6;

        tablero[6][0]=0;
        tablero[6][1]=6;
        tablero[6][2]=0;
        tablero[6][3]=0;
        tablero[6][4]=0;
        tablero[6][5]=0;
        tablero[6][6]=2;
        tablero[6][7]=8;
        tablero[6][8]=0;

        tablero[7][0]=0;
        tablero[7][1]=0;
        tablero[7][2]=0;
        tablero[7][3]=4;
        tablero[7][4]=1;
        tablero[7][5]=9;
        tablero[7][6]=0;
        tablero[7][7]=0;
        tablero[7][8]=5;

        tablero[8][0]=0;
        tablero[8][1]=0;
        tablero[8][2]=0;
        tablero[8][3]=0;
        tablero[8][4]=8;
        tablero[8][5]=0;
        tablero[8][6]=0;
        tablero[8][7]=7;
        tablero[8][8]=9;

        /*{
                {5,3,0,0,7,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0}};
*/

        visualizarTablero(tablero);
        String salir;
        do {

            int fila=0;


            System.out.print("Fila (o fin para salir): ");
            salir=br.readLine();

            if (!salir.equalsIgnoreCase("fin")){
                try {
                    fila = Integer.parseInt(salir);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            System.out.print("Columna: ");
            int columna = Integer.parseInt(br.readLine());

            System.out.print("Numero: ");
            int numero = Integer.parseInt(br.readLine());

            if (!(fila==0 && columna==0)
                    && !(fila==0 && columna==1)
                    && !(fila==0 && columna==4)
                    && !(fila==1 && columna==0)
                    && !(fila==1 && columna==3)
                    && !(fila==1 && columna==4)
                    && !(fila==1 && columna==5)
                    && !(fila==2 && columna==1)
                    && !(fila==2 && columna==2)
                    && !(fila==2 && columna==7)
                    && !(fila==3 && columna==0)
                    && !(fila==3 && columna==4)
                    && !(fila==3 && columna==8)
                    && !(fila==4 && columna==0)
                    && !(fila==4 && columna==3)
                    && !(fila==4 && columna==5)
                    && !(fila==4 && columna==8)
                    && !(fila==5 && columna==0)
                    && !(fila==5 && columna==4)
                    && !(fila==5 && columna==8)
                    && !(fila==6 && columna==1)
                    && !(fila==6 && columna==6)
                    && !(fila==6 && columna==7)
                    && !(fila==7 && columna==3)
                    && !(fila==7 && columna==4)
                    && !(fila==7 && columna==5)
                    && !(fila==7 && columna==8)
                    && !(fila==8 && columna==4)
                    && !(fila==8 && columna==7)
                    && !(fila==8 && columna==9)
                    && (fila<9 && columna<9 && numero<10)){




            tablero[fila][columna] = numero;}
            else System.out.println(fila+","+columna+" no se puede cambiar!");

            visualizarTablero(tablero);}
        }while(!hayGanador(tablero) && !salir.equalsIgnoreCase("fin"));

        if (hayGanador(tablero)) System.out.println("Has ganado!!!!!");
        else System.out.println("Adios!!!!");


    }

    private static boolean hayGanador(int[][] tablero) {

        int suma=0;
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j < 9; j++) {

                suma+=tablero[i][j];
            }
            if (suma!=45) return false;
        }
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j < 9; j++) {

                suma+=tablero[j][i];
            }
            if (suma!=45) return false;
        }

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {

                suma+=tablero[j][i];
            }
            if (suma!=45) return false;
        }

        for (int i = 0; i <3 ; i++) {
            for (int j = 3; j < 6; j++) {

                suma+=tablero[j][i];
            }
            if (suma!=45) return false;
        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 6; j < 9; j++) {

                suma+=tablero[j][i];
            }
            if (suma!=45) return false;
        }
        for (int i = 3; i <6 ; i++) {
            for (int j = 0; j < 3; j++) {

                suma+=tablero[j][i];
            }
            if (suma!=45) return false;
        }
        for (int i = 3; i <6 ; i++) {
            for (int j = 3; j < 6; j++) {

                suma+=tablero[j][i];
            }
            if (suma!=45) return false;
        }
        for (int i = 3; i <6 ; i++) {
            for (int j = 6; j < 9; j++) {

                suma+=tablero[j][i];
            }
            if (suma!=45) return false;
        }
        for (int i = 6; i <9 ; i++) {
            for (int j = 0; j < 3; j++) {

                suma+=tablero[j][i];
            }
            if (suma!=45) return false;
        }
        for (int i = 6; i <9 ; i++) {
            for (int j = 3; j < 6; j++) {

                suma+=tablero[j][i];
            }
            if (suma!=45) return false;
        }
        for (int i = 6; i <9 ; i++) {
            for (int j = 6; j < 9; j++) {

                suma+=tablero[j][i];
            }
            if (suma!=45) return false;
        }

        return true;
    }


    private static void visualizarTablero(int[][] tablero) {
        String x=" ";
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j]!=0) System.out.format("%3d", tablero[i][j]);
                else System.out.format("%3s", x);
            }
            System.out.print(" |");
            for (int j = 3; j < 6; j++) {
                if (tablero[i][j]!=0) System.out.format("%3d", tablero[i][j]);
                else System.out.format("%3s", x);
            }
            System.out.print(" |");

            for (int j = 6; j < 9; j++) {
                if (tablero[i][j]!=0) System.out.format("%3d", tablero[i][j]);
                else System.out.format("%3s", x);
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
        for (int i = 3; i < 6 ; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j]!=0) System.out.format("%3d", tablero[i][j]);
                else System.out.format("%3s", x);
            }
            System.out.print(" |");
            for (int j = 3; j < 6; j++) {
                if (tablero[i][j]!=0) System.out.format("%3d", tablero[i][j]);
                else System.out.format("%3s", x);
            }
            System.out.print(" |");

            for (int j = 6; j < 9; j++) {
                if (tablero[i][j]!=0) System.out.format("%3d", tablero[i][j]);
                else System.out.format("%3s", x);
            }
            System.out.println();
    }
        System.out.println("--------------------------------");
        for (int i = 6; i < 9 ; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j]!=0) System.out.format("%3d", tablero[i][j]);
                else System.out.format("%3s", x);
            }
            System.out.print(" |");
            for (int j = 3; j < 6; j++) {
                if (tablero[i][j]!=0) System.out.format("%3d", tablero[i][j]);
                else System.out.format("%3s", x);
            }
            System.out.print(" |");

            for (int j = 6; j < 9; j++) {
                if (tablero[i][j]!=0) System.out.format("%3d", tablero[i][j]);
                else System.out.format("%3s", x);
            }
            System.out.println();
        }
}}
