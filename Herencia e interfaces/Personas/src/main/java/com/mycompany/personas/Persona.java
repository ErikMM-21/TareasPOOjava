
package com.mycompany.personas;


public class Persona {
    protected String nombre;
    protected int edad;
    
     public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    } 
     
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
