package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] pregunta = new String[5];
        String[] respuesta = new String[5];

        pregunta[0] = "¿En que deporte se usa tiza?";
        pregunta[1] = "¿Cuantas manos tiene un caballo?";
        pregunta[2] = "¿Que instrumento musical tiene nombre y forma geométricos?";
        pregunta[3] = "¿Cuales son las dos primeras palabras de la biblia?";
        pregunta[4] = "¿Quién escribió \"El diario de Ana Frank\"?";

        respuesta[0] = "En el billar, para frotar las puntas de los tacos";
        respuesta[1] = "Dos";
        respuesta[2] = "El triángulo";
        respuesta[3] = "\"Al principio\"";
        respuesta[4] = "Ana Frank";

        int correctas = 0;
        int incorrectas = 0;

        String continuar;

        Random random = new Random();
        int numero = random.nextInt(5);


        do {
            System.out.println(pregunta[numero]);
            System.out.print("Dale al Enter para ver la respuesta...");
            br.readLine();
            System.out.println(respuesta[numero]);
            System.out.println("¿Es correcta? (s/N)");
            String correcta = br.readLine();

            if (correcta.equalsIgnoreCase("s")) correctas++;
            else incorrectas++;

            System.out.println("¿Quiere continuar? (s/N)");
            continuar=br.readLine();
        }while(continuar.equalsIgnoreCase("s"));

        System.out.println("Correctas: "+correctas);
        System.out.println("Incorrectas: "+incorrectas);

    }
}
