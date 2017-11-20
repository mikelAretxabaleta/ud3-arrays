package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Texto: ");
        String texto=br.readLine();

        String letras="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] recuento=contarLetras(texto,letras);
        visualizarRecuento(recuento, letras);
    }

    private static void visualizarRecuento(int[] recuento, String letras) {

        System.out.print(letras);
        System.out.println();
        for (int i = 0; i < 26; i++) {

            System.out.print(recuento[i]);
        }
    }

    private static int[] contarLetras(String texto, String letras) {


        int[] recuento=new int[26];
        for (int i = 0; i <26 ; i++) {
            recuento[i]=0;
        }

        for (int i = 0; i <texto.length() ; i++) {
            for (int j = 0; j <letras.length() ; j++) {


                if (texto.toUpperCase().charAt(i)==letras.charAt(j)) recuento[j]++;
            }
        }

return recuento;
    }
    }

