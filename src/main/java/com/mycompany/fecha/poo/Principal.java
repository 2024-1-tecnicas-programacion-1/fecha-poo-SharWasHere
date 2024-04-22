package com.mycompany.fecha.poo;

import java.util.Scanner;

public class Principal {
    /**
     * Método inicial que es ejecutado
     * @param args
     *
     * Complejidad temporal: O(1) Tiempo constante
     */

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriba un día");
        int diaUsuario = lector.nextInt();
        System.out.println("Escriba un mes ");
        int mesUsuario = lector.nextInt();
        System.out.println("Escriba un año");
        int anioUsuario = lector.nextInt();

        Fecha fechaValida = new Fecha(diaUsuario, mesUsuario, anioUsuario);

        if (fechaValida.validarFecha()) {
            System.out.println("La fecha es válida");
        } else {
            System.out.println(fechaValida.fechaLarga());
        }

    }

}
