package org.ieslosremedios.ut6.ProyectoEjem.Ejercicio1;

import com.sun.jdi.InvalidLineNumberException;

public class Main {
    public static void main(String[] args) {
        try {
            verificarNegativo(-2);
        } catch (ExcepcionPropia ep) {
            System.out.println("Se ha producido una excepción personalizada: " + ep.getMessage());
        } catch (Exception e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        }
    }

    private static void verificarNegativo(int num) throws Exception {
        if (num < 0) {
            throw new Exception("El número no puede ser negativo.");
        } else {
            throw new ExcepcionPropia("Lanzo una excepción propia.");
        }
    }
}