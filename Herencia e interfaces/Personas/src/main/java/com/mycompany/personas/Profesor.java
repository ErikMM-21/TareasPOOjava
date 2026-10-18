
package com.mycompany.personas;

public class Profesor extends Persona{
    private int numempleado;

    public Profesor(int numempleado) {
        this.numempleado = numempleado;
    }

    public Profesor(int numempleado, String nombre, int edad) {
        super(nombre, edad);
        this.numempleado = numempleado;
    }
    @Override
    public String toString() {
        return "Un profesor de edad " +edad+ ", con clave " + numempleado;
    }
    
}
