
package com.mycompany.desglosedinero;

public class Dinero {
    private int denominacion;
    private String plantilla;
    
    public static Dinero[] Billetes=new Dinero[]{
    new Dinero("Billetes",500),
    new Dinero("Billetes",200),
    new Dinero("Billetes",100),
    new Dinero("Billetes",50),
    new Dinero("Billetes",20),
    new Dinero("Monedas",10),
    new Dinero("Monedas",5),
    new Dinero("Monedas",2),
    new Dinero("Monedas",1),
    };

    public Dinero(String plantilla,int denominacion) {
        this.denominacion = denominacion;
        this.plantilla = plantilla;
    }

    public int getDenominacion() {
        return denominacion;
    }

    public String getPlantilla() {
        return plantilla;
    }

    public Dinero[] getBilletes() {
        return Billetes;
    }

   

    @Override
    public String toString() {
        return plantilla+" de $"+denominacion;
    }
    
}
