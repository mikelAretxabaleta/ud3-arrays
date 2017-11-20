package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int ALUMNOS = 3;
        String[] nombre = new String[ALUMNOS];
        String buscar;

        do {
            for (int i = 0; i < ALUMNOS; i++) {
                System.out.print("Nombre y apellidos: ");
                nombre[i] = br.readLine();
            }
            System.out.println("Buscar letra: ");
            buscar = br.readLine();

            for (int i = 0; i < ALUMNOS; i++) {
                if (nombre[i].charAt(0) == buscar.charAt(0)) System.out.println(nombre[i]);
            }

        } while (!buscar.equalsIgnoreCase("fin"));
    }
}
