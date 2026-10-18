package com.mycompany.tablas;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable{
    
    @FXML private TextField txt1;
    @FXML private TextArea txt2;
    
    @FXML
    private void calcular(){
     int x=Integer.parseInt(txt1.getText());
        for(int i=1;i<11;i++){
        txt2.appendText(x+"x"+i+"= "+x*i+"\n");
        }   
    }
    @FXML
    private void limpiar()  {
      txt1.setText("");
      txt2.setText("");
      
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
           
    }
}
