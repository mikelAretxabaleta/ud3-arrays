package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.awt.Color.blue;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] tablero = new int[9][9];
        int[][] tableroJugador = new int[9][9];

        Random random = new Random();
        Random random2 = new Random();

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
        int suma = 0;
        int k = 0;

//HashSet<Integer> numeros=new HashSet<>();


        HashSet<Integer>[] numeroH = new HashSet[9];
        HashSet<Integer>[] numeroV = new HashSet[9];
        HashSet<Integer>[] cuadrado = new HashSet[9];
        HashSet<Integer>[] cuadrado2 = new HashSet[9];


        for (int i = 0; i < 9; i++) {
            numeroH[i] = new HashSet<>();
            numeroV[i] = new HashSet<>();
            cuadrado[i] = new HashSet<>();
            cuadrado2[i] = new HashSet<>();


        }


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                numeroH[j].clear();
                numeroV[i].clear();
                cuadrado[i].clear();
            }

        }
        visualizarTablero(tablero);


    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            numeroH[j].clear();
            numeroV[i].clear();
            cuadrado[i].clear();
            cuadrado2[i].clear();
            tablero[i][j]=0;
        }

    }
    do {
        k = 0;
        for (int i = 3; i < 6; i++) {
            int rep = 0;
            do {


                for (int j = 3; j < 6; j++) {
                    int repeticiones = 0;
                    do {
                        tablero[i][j] = (random.nextInt(9)) + 1;


                        if (!cuadrado[4].contains(tablero[i][j]) && !numeroH[j].contains(tablero[i][j]) && !numeroV[i].contains(tablero[i][j])) {
                            cuadrado[4].add(tablero[i][j]);
                            numeroH[j].add(tablero[i][j]);
                            numeroV[i].add(tablero[i][j]);
                        } else {
                            tablero[i][j] = 0;
                        }


                        repeticiones++;


                    } while (tablero[i][j] == 0 && repeticiones < 380);

                    if (repeticiones > 379) k = 1;

                    //visualizarTablero(tablero);
                }
                rep++;
                //if (rep>7) i--;
            } while (k == 1 && rep < 28);




        }
        if (k == 1) {
            cuadrado[4].clear();
            for (int i = 3; i < 6; i++) {
                for (int j = 3; j < 6; j++) {


                    numeroH[i].remove(tablero[i][j]);
                    numeroV[j].remove(tablero[i][j]);
                }
            }
        } else if (k == 0) cuadrado2[4] = cuadrado[4];
    } while (k==1);
    visualizarTablero(tablero);
        System.out.println();

    do {
        int rep = 0;
        k = 0;

        for (int i = 3; i < 6; i++) {


            for (int j = 0; j < 3; j++) {
                int repeticiones = 0;
                do {
                    tablero[i][j] = (random.nextInt(9)) + 1;


                    if (!cuadrado[3].contains(tablero[i][j]) && !numeroH[j].contains(tablero[i][j]) && !numeroV[i].contains(tablero[i][j])) {
                        cuadrado[3].add(tablero[i][j]);
                        numeroH[j].add(tablero[i][j]);
                        numeroV[i].add(tablero[i][j]);
                    } else {
                        tablero[i][j] = 0;
                        repeticiones++;
                    }


                } while (tablero[i][j] == 0 && repeticiones < 28);
                visualizarTablero(tablero);
                if (repeticiones > 27) k = 1;

                //visualizarTablero(tablero);
            }
            rep++;




        }
        if (k == 1) {
            cuadrado[3].clear();
            for (int i = 3; i < 6; i++) {
                for (int j = 0; j < 3; j++) {


                    numeroH[j].remove(tablero[i][j]);
                    numeroV[i].remove(tablero[i][j]);
                    tablero[i][j] = 0;

                }
            }
        } else if (k == 0) cuadrado2[3] = cuadrado[3];
    } while (k==1);
    visualizarTablero(tablero);
        System.out.println();
        /*if (k == 1) {
            for (int i2 = 3; i2 < 6; i2++) {
                for (int j2 = 0; j2 < 3; j2++) {
                    if (numeroH[j2].contains(tablero[i2][j2])) {
                        numeroH[j2].remove(tablero[i2][j2]);
                    }

                    if (numeroV[i2].contains(tablero[i2][j2]))
                        numeroV[i2].remove(tablero[i2][j2]);
                }


            }
            cuadrado[3].clear();
        }
    } while (k == 1);
*/
    do {
        k = 0;
        for (int i = 3; i < 6; i++) {
            int rep = 0;


            for (int j = 6; j < 9; j++) {
                int repeticiones = 0;
                do {
                    tablero[i][j] = (random.nextInt(9)) + 1;


                    if (!cuadrado[5].contains(tablero[i][j]) && !numeroH[j].contains(tablero[i][j]) && !numeroV[i].contains(tablero[i][j])) {
                        cuadrado[5].add(tablero[i][j]);
                        numeroH[j].add(tablero[i][j]);
                        numeroV[i].add(tablero[i][j]);
                    } else {
                        tablero[i][j] = 0;
                    }


                    repeticiones++;


                } while (tablero[i][j] == 0 && repeticiones < 38);

                if (repeticiones > 37) k = 1;

                //visualizarTablero(tablero);
            }
            rep++;
            //if (rep>7) i=0;

        }
        if (k == 1) {
            cuadrado[5].clear();
            for (int i = 3; i < 6; i++) {
                for (int j = 6; j < 9; j++) {


                    numeroH[j].remove(tablero[i][j]);
                    numeroV[i].remove(tablero[i][j]);
                    tablero[i][j] = 0;

                }
            }
        } else if (k == 0) cuadrado2[5] = cuadrado[5];
    } while (k==1);

    do {
        k = 0;
        for (int i = 0; i < 3; i++) {
            int rep = 0;


            for (int j = 3; j < 6; j++) {
                int repeticiones = 0;
                do {
                    tablero[i][j] = (random.nextInt(9)) + 1;


                    if (!cuadrado[1].contains(tablero[i][j]) && !numeroH[j].contains(tablero[i][j]) && !numeroV[i].contains(tablero[i][j])) {
                        cuadrado[1].add(tablero[i][j]);
                        numeroH[j].add(tablero[i][j]);
                        numeroV[i].add(tablero[i][j]);
                    } else {
                        tablero[i][j] = 0;
                    }


                    repeticiones++;


                } while (tablero[i][j] == 0 && repeticiones < 380);

                if (repeticiones > 379) k = 1;

                //visualizarTablero(tablero);
            }
            rep++;
            // if (rep>7) i=0;
        }
        if (k == 1) {
            cuadrado[1].clear();
            for (int i = 0; i < 3; i++) {
                for (int j = 3; j < 6; j++) {


                    numeroH[j].remove(tablero[i][j]);
                    numeroV[i].remove(tablero[i][j]);
                    tablero[i][j] = 0;

                }
            }
        } else if (k == 0) cuadrado2[1] = cuadrado[1];
    } while (k==1);
    visualizarTablero(tablero);
        System.out.println();
    do {
        k = 0;
        for (int i = 6; i < 9; i++) {
            int rep = 0;



            for (int j = 3; j < 6; j++) {
                int repeticiones = 0;
                do {
                    tablero[i][j] = (random.nextInt(9)) + 1;


                    if (!cuadrado[7].contains(tablero[i][j]) && !numeroH[j].contains(tablero[i][j]) && !numeroV[i].contains(tablero[i][j])) {
                        cuadrado[7].add(tablero[i][j]);
                        numeroH[j].add(tablero[i][j]);
                        numeroV[i].add(tablero[i][j]);
                    } else {
                        tablero[i][j] = 0;
                    }


                    repeticiones++;


                } while (tablero[i][j] == 0 && repeticiones < 380);

                if (repeticiones > 379) k = 1;

                //visualizarTablero(tablero);
            }
            rep++;
            //if (rep>7) i=0;
        }
        if (k == 1) {
            cuadrado[7].clear();
            for (int i = 6; i < 9; i++) {
                for (int j = 3; j < 6; j++) {


                    numeroH[j].remove(tablero[i][j]);
                    numeroV[i].remove(tablero[i][j]);
                    tablero[i][j] = 0;

                }
            }
        } else if (k == 0) cuadrado2[7] = cuadrado[7];
    } while (k==1);
    visualizarTablero(tablero);
        System.out.println();
int rep5=0;
int rep2=0;
int rep3=0;
int rep4=0;
int k1;
int k2;
int k3;
int k4;
do{
        cuadrado[0].clear();
    cuadrado2[0].clear();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {


                numeroH[j].remove(tablero[i][j]);
                numeroV[i].remove(tablero[i][j]);
                tablero[i][j] = 0;

            }
        }

    do {
        k1 = 0;
        for (int i = 0; i < 3; i++) {
            int rep = 0;


            for (int j = 0; j < 3; j++) {
                int repeticiones = 0;
                do {
                    tablero[i][j] = (random.nextInt(9)) + 1;


                    if (!cuadrado[0].contains(tablero[i][j]) && !numeroH[j].contains(tablero[i][j]) && !numeroV[i].contains(tablero[i][j])) {
                        cuadrado[0].add(tablero[i][j]);
                        numeroH[j].add(tablero[i][j]);
                        numeroV[i].add(tablero[i][j]);


                    } else {
                        tablero[i][j] = 0;
                        rep5++;
                    }


                    repeticiones++;


                } while (tablero[i][j] == 0 && repeticiones < 380);

                if (repeticiones > 379) k1 = 1;

                //visualizarTablero(tablero);
            }
            rep++;
            //if (rep>7) i--;
        }
        if (k1 == 1) {
            cuadrado[0].clear();
            cuadrado2[0].clear();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {


                    numeroH[j].remove(tablero[i][j]);
                    numeroV[i].remove(tablero[i][j]);
                    tablero[i][j] = 0;

                }
            }
        } else if (k1 == 0) cuadrado2[0] = cuadrado[0];
    } while (cuadrado2[0].isEmpty() && rep5<30);
    visualizarTablero(tablero);
    System.out.println();


    do {
        cuadrado[2].clear();
        cuadrado2[2].clear();
        for (int i = 0; i < 3; i++) {
            for (int j = 6; j < 9; j++) {


                numeroH[j].remove(tablero[i][j]);
                numeroV[i].remove(tablero[i][j]);
                tablero[i][j] = 0;

            }
        }

        do {
            do {
                k2 = 0;
                for (int i = 0; i < 3; i++) {
                    int rep = 0;


                    for (int j = 6; j < 9; j++) {
                        int repeticiones = 0;
                        do {
                            tablero[i][j] = (random.nextInt(9)) + 1;


                            if (!cuadrado[2].contains(tablero[i][j]) && !numeroH[j].contains(tablero[i][j]) && !numeroV[i].contains(tablero[i][j])) {
                                cuadrado[2].add(tablero[i][j]);
                                numeroH[j].add(tablero[i][j]);
                                numeroV[i].add(tablero[i][j]);

                            } else {
                                tablero[i][j] = 0;
                                rep4++;
                            }


                            repeticiones++;


                        } while (tablero[i][j] == 0 && repeticiones < 380);

                        if (repeticiones > 379) k2 = 1;

                        //visualizarTablero(tablero);
                    }
                    rep++;
                    //if (rep>7) i--;
                }
                if (k2 == 1) {
                    cuadrado[2].clear();
                    cuadrado2[2].clear();
                    for (int i = 0; i < 3; i++) {
                        for (int j = 6; j < 9; j++) {


                            numeroH[j].remove(tablero[i][j]);
                            numeroV[i].remove(tablero[i][j]);
                            tablero[i][j] = 0;

                        }
                    }
                } else if (k2 == 0) cuadrado2[2] = cuadrado[2];
            } while (cuadrado2[2].isEmpty() && rep4<30);
            visualizarTablero(tablero);
            System.out.println();


            do {
                cuadrado[6].clear();
                cuadrado2[6].clear();
                for (int i = 6; i < 9; i++) {
                    for (int j = 0; j < 3; j++) {


                        numeroH[j].remove(tablero[i][j]);
                        numeroV[i].remove(tablero[i][j]);
                        tablero[i][j] = 0;

                    }
                }
                do {
                    k3 = 0;
                    for (int i = 6; i < 9; i++) {
                        int rep = 0;


                        for (int j = 0; j < 3; j++) {
                            int repeticiones = 0;
                            do {
                                tablero[i][j] = (random.nextInt(9)) + 1;


                                if (!cuadrado[6].contains(tablero[i][j]) && !numeroH[j].contains(tablero[i][j]) && !numeroV[i].contains(tablero[i][j])) {
                                    cuadrado[6].add(tablero[i][j]);
                                    numeroH[j].add(tablero[i][j]);
                                    numeroV[i].add(tablero[i][j]);

                                } else {
                                    tablero[i][j] = 0;
                                    rep3++;
                                }


                                repeticiones++;


                            } while (tablero[i][j] == 0 && repeticiones < 380);

                            if (repeticiones > 379) k3 = 1;

                            //visualizarTablero(tablero);
                        }
                        rep++;
                        //if (rep>7) i--;
                    }
                    if (k3 == 1) {
                        cuadrado[6].clear();
                        cuadrado2[6].clear();
                        for (int i = 6; i < 9; i++) {
                            for (int j = 0; j < 3; j++) {


                                numeroH[j].remove(tablero[i][j]);
                                numeroV[i].remove(tablero[i][j]);
                                tablero[i][j] = 0;

                            }
                        }
                    } else if (k3 == 0) cuadrado2[6] = cuadrado[6];
                } while (cuadrado2[6].isEmpty() && rep3<30);
                visualizarTablero(tablero);
                System.out.println();
    /*
        if (k == 1) {
            for (int i2 = 6; i2 < 9; i2++) {
                for (int j2 = 0; j2 < 3; j2++) {
                    if (numeroH[j2].contains(tablero[i2][j2])) {
                        numeroH[j2].remove(tablero[i2][j2]);
                    }

                    if (numeroV[i2].contains(tablero[i2][j2]))
                        numeroV[i2].remove(tablero[i2][j2]);
                }


            }
            cuadrado[6].clear();
        }
    } while (k == 1);
*/

                do {
                    cuadrado[8].clear();
                    cuadrado2[8].clear();
                    for (int i = 6; i < 9; i++) {
                        for (int j = 6; j < 9; j++) {


                            numeroH[j].remove(tablero[i][j]);
                            numeroV[i].remove(tablero[i][j]);
                            tablero[i][j] = 0;

                        }
                    }
                    int repeticiones = 0;
                    k4 = 0;
                    for (int i = 6; i < 9; i++) {
                        int rep = 0;
                        int j;


                        int size = 0;
                        for (j = 6; j < 9; j++) {


                            do {
                                int num = (random.nextInt(9)) + 1;
                                tablero[i][j] = num;


                                if (!cuadrado[8].contains(tablero[i][j]) && !numeroH[j].contains(tablero[i][j]) && !numeroV[i].contains(tablero[i][j])) {
                                    cuadrado[8].add(tablero[i][j]);
                                    numeroH[j].add(tablero[i][j]);
                                    numeroV[i].add(tablero[i][j]);
                                } else {
                                    tablero[i][j] = 0;
                                    rep2++;
                                }


                                repeticiones++;


                            } while (tablero[i][j] == 0 && repeticiones < 380);

                            if (repeticiones > 379) k4 = 1;

                        }
                        rep++;
                        //if (rep>7) i--;
                    }
                    if (k4 == 1) {
                        cuadrado[8].clear();
                        cuadrado2[8].clear();
                        for (int i = 6; i < 9; i++) {
                            for (int j = 6; j < 9; j++) {


                                numeroH[j].remove(tablero[i][j]);
                                numeroV[i].remove(tablero[i][j]);
                                tablero[i][j] = 0;

                            }
                        }
                    } else if (k4 == 0) cuadrado2[8] = cuadrado[8];
                } while ( cuadrado2[8].isEmpty() && rep2<8);


            } while ((cuadrado2[8].isEmpty()|| cuadrado2[6].isEmpty()) && k4==1 && k3==1);
        } while ((cuadrado2[8].isEmpty() || cuadrado2[6].isEmpty() || cuadrado2[2].isEmpty())&& rep2<8 && k3==1 && k2==1);
    } while ((cuadrado2[8].isEmpty() || cuadrado2[6].isEmpty() || cuadrado2[2].isEmpty() || cuadrado2[0].isEmpty()) && rep2<8 && k3==1 && k2==1 && k1==1);
}while (cuadrado2[8].isEmpty() || cuadrado2[6].isEmpty() || cuadrado2[2].isEmpty() || cuadrado2[0].isEmpty());
        visualizarTablero(tablero);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tableroJugador[i][j]=0;
            }

        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int a=random2.nextInt(9);
                int b=random2.nextInt(9);
                tableroJugador[a][b]=tablero[a][b]+10;

            }

        }
        visualizarTablero(tableroJugador);

/*
    for (int i = 6; i < 9; i++) {
        for (int j = 6; j < 9; j++) {
            if (numero0[j].contains(tablero[i][j]))
                numero0[j].remove(tablero[i][j]);

            if (numeros[i].contains(tablero[i][j]))
            numeros[i].remove(tablero[i][j]);
        }

    }*/







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


            if ((tableroJugador[fila][columna]==0)
                    && (fila < 9 && columna < 9 && numero < 10)) {


                tableroJugador[fila][columna] = numero;
            } else System.out.println(fila + "," + columna + " no se puede cambiar!");

            visualizarTablero(tableroJugador);
        }
    } while (!hayGanador(tableroJugador) && !salir.equalsIgnoreCase("fin"));

    if (hayGanador(tableroJugador)) System.out.println("Has ganado!!!!!");
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

                if (tablero[i][j]==11 || tablero[i][j]==12 || tablero[i][j]==13 || tablero[i][j]==14 || tablero[i][j]==15 || tablero[i][j]==16 || tablero[i][j]==17 || tablero[i][j]==18 || tablero[i][j]==19) {System.out.print((char)27+"[30;47m");System.out.format("%3d", tablero[i][j]-10);
                System.out.print("\u001B[0m");}
                else if (tablero[i][j]==1 || tablero[i][j]==2 || tablero[i][j]==3 || tablero[i][j]==4 || tablero[i][j]==5 || tablero[i][j]==6 || tablero[i][j]==7 || tablero[i][j]==8 || tablero[i][j]==9) System.out.format("%3d", tablero[i][j]);
                else if (tablero[i][j]==0) {System.out.print((char)27+"[34;44m");
                    System.out.format("%3s", x);
                    System.out.print("\u001B[0m");
                }

            }
            System.out.print(" |");
            for (int j = 3; j < 6; j++) {
                if (tablero[i][j]==11 || tablero[i][j]==12 || tablero[i][j]==13 || tablero[i][j]==14 || tablero[i][j]==15 || tablero[i][j]==16 || tablero[i][j]==17 || tablero[i][j]==18 || tablero[i][j]==19) {System.out.print((char)27+"[30;47m");System.out.format("%3d", tablero[i][j]-10);
                    System.out.print("\u001B[0m");}
                else if (tablero[i][j]==1 || tablero[i][j]==2 || tablero[i][j]==3 || tablero[i][j]==4 || tablero[i][j]==5 || tablero[i][j]==6 || tablero[i][j]==7 || tablero[i][j]==8 || tablero[i][j]==9) System.out.format("%3d", tablero[i][j]);
                    else if (tablero[i][j]==0) {System.out.print((char)27+"[34;44m");
                System.out.format("%3s", x);
                    System.out.print("\u001B[0m");
                }
            }
            System.out.print(" |");

            for (int j = 6; j < 9; j++) {
                if (tablero[i][j]==11 || tablero[i][j]==12 || tablero[i][j]==13 || tablero[i][j]==14 || tablero[i][j]==15 || tablero[i][j]==16 || tablero[i][j]==17 || tablero[i][j]==18 || tablero[i][j]==19) {System.out.print((char)27+"[30;47m");System.out.format("%3d", tablero[i][j]-10);
                    System.out.print("\u001B[0m");}
                else if (tablero[i][j]==1 || tablero[i][j]==2 || tablero[i][j]==3 || tablero[i][j]==4 || tablero[i][j]==5 || tablero[i][j]==6 || tablero[i][j]==7 || tablero[i][j]==8 || tablero[i][j]==9) System.out.format("%3d", tablero[i][j]);
                else if (tablero[i][j]==0) {System.out.print((char)27+"[34;44m");
                System.out.format("%3s", x);
                    System.out.print("\u001B[0m");
                }
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
        for (int i = 3; i < 6 ; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j]==11 || tablero[i][j]==12 || tablero[i][j]==13 || tablero[i][j]==14 || tablero[i][j]==15 || tablero[i][j]==16 || tablero[i][j]==17 || tablero[i][j]==18 || tablero[i][j]==19) {System.out.print((char)27+"[30;47m");System.out.format("%3d", tablero[i][j]-10);
                    System.out.print("\u001B[0m");}
                else if (tablero[i][j]==1 || tablero[i][j]==2 || tablero[i][j]==3 || tablero[i][j]==4 || tablero[i][j]==5 || tablero[i][j]==6 || tablero[i][j]==7 || tablero[i][j]==8 || tablero[i][j]==9) System.out.format("%3d", tablero[i][j]);
                else if (tablero[i][j]==0) {System.out.print((char)27+"[34;44m");
                System.out.format("%3s", x);
                    System.out.print("\u001B[0m");
                }
            }
            System.out.print(" |");
            for (int j = 3; j < 6; j++) {
                if (tablero[i][j]==11 || tablero[i][j]==12 || tablero[i][j]==13 || tablero[i][j]==14 || tablero[i][j]==15 || tablero[i][j]==16 || tablero[i][j]==17 || tablero[i][j]==18 || tablero[i][j]==19) {System.out.print((char)27+"[30;47m");System.out.format("%3d", tablero[i][j]-10);
                    System.out.print("\u001B[0m");}
                else if (tablero[i][j]==1 || tablero[i][j]==2 || tablero[i][j]==3 || tablero[i][j]==4 || tablero[i][j]==5 || tablero[i][j]==6 || tablero[i][j]==7 || tablero[i][j]==8 || tablero[i][j]==9) System.out.format("%3d", tablero[i][j]);
                else if (tablero[i][j]==0) {System.out.print((char)27+"[34;44m");
                System.out.format("%3s", x);
                    System.out.print("\u001B[0m");
                }
            }
            System.out.print(" |");

            for (int j = 6; j < 9; j++) {
                if (tablero[i][j]==11 || tablero[i][j]==12 || tablero[i][j]==13 || tablero[i][j]==14 || tablero[i][j]==15 || tablero[i][j]==16 || tablero[i][j]==17 || tablero[i][j]==18 || tablero[i][j]==19) {System.out.print((char)27+"[30;47m");System.out.format("%3d", tablero[i][j]-10);
                    System.out.print("\u001B[0m");}
                else if (tablero[i][j]==1 || tablero[i][j]==2 || tablero[i][j]==3 || tablero[i][j]==4 || tablero[i][j]==5 || tablero[i][j]==6 || tablero[i][j]==7 || tablero[i][j]==8 || tablero[i][j]==9) System.out.format("%3d", tablero[i][j]);
                else if (tablero[i][j]==0) {System.out.print((char)27+"[34;44m");
                System.out.format("%3s", x);
                    System.out.print("\u001B[0m");
                }
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
        for (int i = 6; i < 9 ; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j]==11 || tablero[i][j]==12 || tablero[i][j]==13 || tablero[i][j]==14 || tablero[i][j]==15 || tablero[i][j]==16 || tablero[i][j]==17 || tablero[i][j]==18 || tablero[i][j]==19) {System.out.print((char)27+"[30;47m");System.out.format("%3d", tablero[i][j]-10);
                    System.out.print("\u001B[0m");}
                else if (tablero[i][j]==1 || tablero[i][j]==2 || tablero[i][j]==3 || tablero[i][j]==4 || tablero[i][j]==5 || tablero[i][j]==6 || tablero[i][j]==7 || tablero[i][j]==8 || tablero[i][j]==9) System.out.format("%3d", tablero[i][j]);
                else if (tablero[i][j]==0) {System.out.print((char)27+"[34;44m");
                System.out.format("%3s", x);
                    System.out.print("\u001B[0m");
                }
            }
            System.out.print(" |");
            for (int j = 3; j < 6; j++) {
                if (tablero[i][j]==11 || tablero[i][j]==12 || tablero[i][j]==13 || tablero[i][j]==14 || tablero[i][j]==15 || tablero[i][j]==16 || tablero[i][j]==17 || tablero[i][j]==18 || tablero[i][j]==19) {System.out.print((char)27+"[30;47m");System.out.format("%3d", tablero[i][j]-10);
                    System.out.print("\u001B[0m");}
                else if (tablero[i][j]==1 || tablero[i][j]==2 || tablero[i][j]==3 || tablero[i][j]==4 || tablero[i][j]==5 || tablero[i][j]==6 || tablero[i][j]==7 || tablero[i][j]==8 || tablero[i][j]==9) System.out.format("%3d", tablero[i][j]);
                else if (tablero[i][j]==0) {System.out.print((char)27+"[34;44m");
                System.out.format("%3s", x);
                    System.out.print("\u001B[0m");
                }
            }
            System.out.print(" |");

            for (int j = 6; j < 9; j++) {
                if (tablero[i][j]==11 || tablero[i][j]==12 || tablero[i][j]==13 || tablero[i][j]==14 || tablero[i][j]==15 || tablero[i][j]==16 || tablero[i][j]==17 || tablero[i][j]==18 || tablero[i][j]==19) {System.out.print((char)27+"[30;47m");System.out.format("%3d", tablero[i][j]-10);
                    System.out.print("\u001B[0m");}
                else if (tablero[i][j]==1 || tablero[i][j]==2 || tablero[i][j]==3 || tablero[i][j]==4 || tablero[i][j]==5 || tablero[i][j]==6 || tablero[i][j]==7 || tablero[i][j]==8 || tablero[i][j]==9) System.out.format("%3d", tablero[i][j]);
                else if (tablero[i][j]==0) {System.out.print((char)27+"[34;44m");
                System.out.format("%3s", x);
                    System.out.print("\u001B[0m");
                }
            }
            System.out.println();
        }
    }}
