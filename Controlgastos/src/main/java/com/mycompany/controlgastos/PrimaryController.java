package com.mycompany.controlgastos;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private TextField txt1,txt2,txt3,txt4,txt5,txt6,txt7;
    int a,b,c,e,f;
    int[] x=new int[]{a,b,c,e,f};
    @FXML
    private void calcular(){
      a=Integer.parseInt(txt1.getText());
      x[0]=a;
      b=Integer.parseInt(txt2.getText());
       x[1]=b;
      c=Integer.parseInt(txt3.getText());
       x[2]=c;
      e=Integer.parseInt(txt5.getText());
       x[3]=e;
      f=Integer.parseInt(txt6.getText());
       x[4]=f;
     txt4.setText(""+(a+b+c+e+f));
     if(mayor()==a){
       txt7.setText("Alimentacion");  
     }else if(mayor()==b){
       txt7.setText("Refrigerios");  
     }else if(mayor()==c){
       txt7.setText("Transporte");  
     }else if(mayor()==e){
       txt7.setText("Telefonia");  
     }else if(mayor()==f){
       txt7.setText("otros");  
     }
     txt7.setEditable(false);
    }
    @FXML
    private void limpiar(){
    txt1.setText("");
    txt2.setText("");
    txt3.setText("");
    txt4.setText("");
    txt5.setText("");
    txt6.setText("");
    txt7.setText("");
    }
    
    
    public int mayor(){      
        //(condicion)?verdadero:falso;
   
   int mayor=a;
   
   for(int i=0;i<5;i++){
        if(mayor<x[i]){
            mayor=x[i];
            }
   }
    return mayor;
    }
}
