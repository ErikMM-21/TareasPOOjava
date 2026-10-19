
package com.mycompany.figura;

public class FiguraRecta extends Figura2D{
    protected int ancho;
    protected int alto;  

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    @Override
    public double calcularArea() {
        double area;
        area=(alto*ancho)/2.0;
        return area;
    }

    @Override
    public double calcularPerimetro() {
    double perimetro;
    perimetro=Math.sqrt((Math.pow(ancho,2)+Math.pow(alto,2)));
    perimetro=perimetro+alto+ancho;
    return perimetro;
    }
}
