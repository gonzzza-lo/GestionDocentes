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
        
    }
}
