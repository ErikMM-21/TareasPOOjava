package com.mycompany.conteoclick;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable{
    @FXML TextField txt1;
    @FXML Button btn2;
    @FXML ProgressBar pg;
    private int cont=1;
    
    
    
    
    @FXML
    private void clicks() {
    txt1.setText(""+cont);
    cont++;
    }
    
    @FXML
    private void esperar() {
    Thread espera=new Thread(new Runnable(){
    @Override
    public void run() {
        
        bar();
        }
      });
      espera.setDaemon(true);
      espera.start();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
  
    }
    public void bar(){
    btn2.setDisable(true);
    for(int i=0;i<100;i++){
        pg.setProgress(i/100.0);
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            
        }
      }
     pg.setProgress(0);
     btn2.setDisable(false);
    }
}
