package com.rigoberto.clase02.clase2ejercio03;

import java.util.Scanner;

public class claseMain {

    public static void main(String[] args) {

// Seccion para tomar los datos por teclado 
        Scanner sc = new Scanner(System.in);
        System.out.println("ESCRIBE TU NOMBRE");
        String Nombre = sc.nextLine();
        System.out.println("ESCRIBE TU DIRECCION");
        String Direccion = sc.nextLine();
        System.out.println("ESCRIBE TU FECHA DE NACIMIENTO");
        String Fecha = sc.nextLine();
        System.out.println("ESCRIBE TU EDAD");
        int Edad = sc.nextInt();
        String Genero = sc.nextLine();

        Profesor profe = new Profesor();

        profe.setNombre(Nombre);
        profe.setDireccion(Direccion);
        profe.setEdad(Edad);
        profe.setFechaNc(Fecha);
        profe.setGenero(Genero);
        System.out.println(profe.esMayorDeEdad());
        System.out.println(profe.MostrarSinEdad());

    }

}
