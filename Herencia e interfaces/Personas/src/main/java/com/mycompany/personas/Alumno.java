
package com.mycompany.personas;


public class Alumno extends Persona{
    public Alumno(){
    }
    public Alumno(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String toString(){
        return "Se crea Alumno...\nUn Alumno llamado: " +nombre;
    }
    
    
}
