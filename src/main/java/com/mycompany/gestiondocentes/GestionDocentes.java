/*
 * 
 */

package com.mycompany.gestiondocentes;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class GestionDocentes {
public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        Docente docente = new Docente();
        System.out.println("Ingrese numero de legajo: ");
        docente.numeroDeLegajo = in.nextInt();
        System.out.println("Ingrese nombre y apellido: ");
        docente.nombreYapellido = in.next();
        System.out.println("Ingrese fecha de nacimiento: ");
        docente.fechaDeNacimiento = in.nextInt();
        System.out.println("Ingrese la edad: ");
        docente.edad = in.nextInt();
        System.out.println("Ingrese el salario: ");
        docente.salario = in.nextFloat();
        System.out.println("Ingrese si es titular: ");
        docente.titular = in.nextBoolean();
        
        
    }
}
