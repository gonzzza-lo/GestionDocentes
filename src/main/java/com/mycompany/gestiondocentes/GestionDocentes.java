/*
 * 
 */

package com.mycompany.gestiondocentes;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
import java.util.Scanner;

public class GestionDocentes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de docente (titular/suplente): ");
        String tipo = scanner.nextLine();

        System.out.print("Legajo: ");
        int legajo = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Fecha de nacimiento (DD/MM/AAAA): ");
        String fechaNacimiento = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        System.out.print("Salario: ");
        double salario = scanner.nextDouble();

        if (tipo.equalsIgnoreCase("titular")) {
            System.out.print("Antigüedad (en años): ");
            int antiguedad = scanner.nextInt();
            Titular docenteTitular = new Titular(legajo, nombre, apellido, fechaNacimiento, edad, salario, antiguedad);
            System.out.println("Salario con Plus: " + docenteTitular.calcularPlusSalarial());
        } else if (tipo.equalsIgnoreCase("suplente")) {
            scanner.nextLine(); // Consumir nueva línea
            System.out.print("Zona rural: ");
            String zonaRural = scanner.nextLine();
            Suplente docenteSuplente = new Suplente(legajo, nombre, apellido, fechaNacimiento, edad, salario, zonaRural);
            System.out.println("Salario con Plus: " + docenteSuplente.calcularPlusSalarial());
        } else {
            System.out.println("Tipo de docente no reconocido.");
        }

        scanner.close();
    }
}

