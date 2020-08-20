/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rigoberto.clase02.clase2ejercio03;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ClaseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
Profesor Profe = new Profesor ("Rigoberto", "Agua Caliente", "13/09/2000", "M", 19, "ING", "PROGRAMADOR");
System.out.println(Profe.toString() );

Estudiante est = new Estudiante ("Jose", "Chalatenango",  "28/09/95",   "M",  25, 1000, "ing. en Sistemas y Computacion");
System.out.println(est.toString() );

    }

}
