package org.ieslosremedios.ut6.ProyectoEjem.Ejercicio2;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Introduce el número de discos de la torre inicial: ");
        num = scanner.nextInt();
        int numDiscos = num;

        System.out.println();
        System.out.println("Pasos a seguir: ");
        moverDiscos(numDiscos, "A", "C", "B");
        System.out.println();
        System.out.println("¡Objetivo completado!");
    }

    public static void moverDiscos(int numDiscos, String torreOrigen, String torreDestino, String torreApoyo) {

        if (numDiscos == 1) {
            // Si hay un disco, es tan simple como moverlo de A a C
            System.out.println("- Muevo disco " + numDiscos + " de " + torreOrigen + " a " + torreDestino);
        } else {
            moverDiscos(numDiscos - 1, torreOrigen, torreApoyo, torreDestino);
            System.out.println("- Muevo disco " + numDiscos + " de " + torreOrigen + " a " + torreDestino);
            moverDiscos(numDiscos - 1, torreApoyo, torreDestino, torreOrigen);
        }
    }
}
