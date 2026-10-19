
package com.mycompany.figura;

public class Circulo extends FiguraCircular{

    public Circulo(int a) {
        radio=a;
    }
    
    @Override
    public String imprimeFigura(){
    return String.format(super.imprimeFigura()+"\nSe imprime un circulo de radio: %d, area:\n"
            + "%.2f, perimetro: %.2f",radio,calcularArea(),calcularPerimetro());
    }
}
