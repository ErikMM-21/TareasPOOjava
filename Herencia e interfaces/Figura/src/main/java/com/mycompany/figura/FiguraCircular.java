
package com.mycompany.figura;


public class FiguraCircular extends Figura2D{
    protected int radio;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    

    @Override
    public double calcularArea() {
        double area;
        area=(Math.PI)*Math.pow(radio, 2);
        return area;
        }

    @Override
    public double calcularPerimetro() {
        double perimetro;
        perimetro=2.0*Math.PI*radio;
    return perimetro; 
    }
}
