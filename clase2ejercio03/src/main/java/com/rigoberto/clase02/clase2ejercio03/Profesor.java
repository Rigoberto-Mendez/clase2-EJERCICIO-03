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
public class Profesor extends Persona {

    private String Titulo;
    private String Dedicacion;

    public Profesor
        (String Nombre, String Direccion, String FechaNC, String Genero, int Edad, String Titulo, String Dedicacion) {

        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.FechaNC = FechaNC;
        this.Genero = Genero;
        this.Edad = Edad;
        this.Titulo = Titulo;
        this.Dedicacion = Dedicacion;

    }
        
    @Override
    public String toString() {
        return "Profesor {" + "Nombre=" + Nombre + ", Direccion=" + Direccion + ", FechaNC=" + FechaNC + ", Genero=" + Genero + ", Edad=" + Edad+ ", Titulo=" + Titulo + ", Dedicacion=" + Dedicacion + '}';
    }

    
}
