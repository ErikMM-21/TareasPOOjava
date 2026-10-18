package com.mycompany.desglosedinero;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {
    
    @FXML TextField txt1;
    @FXML TextArea txt2,txt3;
    int[] cont=new int[]{0,0,0,0,0,0,0,0,0};
  
    @FXML
    private void clear(){
        txt1.setText("");
        txt3.setText("");
    }
    @FXML
    private void calcula() {
        int a=Integer.parseInt(txt1.getText());
        mat(a);
        for(int j=0;j<cont.length;j++){
        txt3.appendText(cont[j]+"\n");
        }
    }
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        for(int i=0;i<Dinero.Billetes.length;i++){
        txt2.appendText(Dinero.Billetes[i].toString()+"\n ");
        }
    }
   public void mat(int num){
       for(int j=0;j<Dinero.Billetes.length;j++){
       int valor=Dinero.Billetes[j].getDenominacion();
       cont[j]=num/valor;
       num=num%valor;
       }
   } 
}



