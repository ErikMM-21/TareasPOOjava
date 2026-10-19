
package com.mycompany.figura;

public class TrianguloRect extends FiguraRecta{

    public TrianguloRect(int a, int b) {
     alto=a;
     ancho=b;
    }

    @Override
    public String imprimeFigura(){
    return super.imprimeFigura()+"\nSe imprime un triangulo con alto: "+alto+", ancho:\n"
            +ancho+" area: "+calcularArea()+", perimetro: "+calcularPerimetro()+"\n";
    }
    
}
