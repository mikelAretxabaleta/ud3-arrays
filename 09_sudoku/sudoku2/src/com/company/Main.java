package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static java.awt.Color.blue;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] tablero=new int[9][9];
        Random random=new Random();
        Random random2=new Random();

/*
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
        tablero[random.nextInt(9)][random.nextInt(9)]=random.nextInt(10);
*/
int suma=0;
int k=0;
HashSet<Integer> numeros=new HashSet<>();

        Set<Integer>[] numero0=new HashSet[9];

        for (int i = 0; i < numero0.length; i++) {
            numero0[i]=new HashSet<>();

        }



        for (int i = 0; i < 9; i++) {


            for (int j = 0; j < 9; j++) {


do{
    tablero[i][j] = random.nextInt(9) + 1;


    if (!numeros.contains(tablero[i][j])) {
        numeros.add(tablero[i][j]);
    }
    else tablero[i][j]=0;
   if (!numero0[j].contains(tablero[i][j])){
       numero0[j].add(tablero[i][j]);
       k=1;
   }
   else k=0;





            }while (!(tablero[i][j]!=0 && k==1));
visualizarTablero(tablero);
        }numeros.clear();
            k=0;




    }






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

        int fila = 0;


        System.out.print("Fila (o fin para salir): ");
        salir = br.readLine();

        if (!salir.equalsIgnoreCase("fin")) {
            try {
                fila = Integer.parseInt(salir);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

            System.out.print("Columna: ");
            int columna = Integer.parseInt(br.readLine());

            System.out.print("Numero: ");
            int numero = Integer.parseInt(br.readLine());

            if (!(fila == 0 && columna == 0)
                    && !(fila == 0 && columna == 1)
                    && !(fila == 0 && columna == 4)
                    && !(fila == 1 && columna == 0)
                    && !(fila == 1 && columna == 3)
                    && !(fila == 1 && columna == 4)
                    && !(fila == 1 && columna == 5)
                    && !(fila == 2 && columna == 1)
                    && !(fila == 2 && columna == 2)
                    && !(fila == 2 && columna == 7)
                    && !(fila == 3 && columna == 0)
                    && !(fila == 3 && columna == 4)
                    && !(fila == 3 && columna == 8)
                    && !(fila == 4 && columna == 0)
                    && !(fila == 4 && columna == 3)
                    && !(fila == 4 && columna == 5)
                    && !(fila == 4 && columna == 8)
                    && !(fila == 5 && columna == 0)
                    && !(fila == 5 && columna == 4)
                    && !(fila == 5 && columna == 8)
                    && !(fila == 6 && columna == 1)
                    && !(fila == 6 && columna == 6)
                    && !(fila == 6 && columna == 7)
                    && !(fila == 7 && columna == 3)
                    && !(fila == 7 && columna == 4)
                    && !(fila == 7 && columna == 5)
                    && !(fila == 7 && columna == 8)
                    && !(fila == 8 && columna == 4)
                    && !(fila == 8 && columna == 7)
                    && !(fila == 8 && columna == 9)
                    && (fila < 9 && columna < 9 && numero < 10)) {


                tablero[fila][columna] = numero;
            } else System.out.println(fila + "," + columna + " no se puede cambiar!");

            visualizarTablero(tablero);
        }
    } while (!hayGanador(tablero) && !salir.equalsIgnoreCase("fin"));

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
            if (suma!=36) return false;
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
