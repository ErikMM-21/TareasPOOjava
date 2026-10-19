package com.mycompany.liebreytortuga;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class PrimaryController implements Initializable{
    @FXML private ProgressBar pgb1,pgb2;
    @FXML private Button btn;
    @FXML private Label lbl1,lbl2;
    private String action="";
    
    @FXML
    private void corran() {
    btn.setDisable(true);
    lbl2.setText("La tortuga: Esta Corriendo!");
    lbl1.setText("La liebre: Esta Corriendo!");
    Thread espera=new Thread(new Runnable(){
    @Override
    public void run() { 
        tortuga();
        javafx.application.Platform.runLater(() -> {
            lbl2.setText("La tortuga: Gano!");
        });
        }
      });
    Thread espera2=new Thread(new Runnable(){
    @Override
    public void run() { 
        liebre(0,55);
        javafx.application.Platform.runLater(() -> {
            lbl1.setText("La liebre: Se durmio");
        });
        try {
            
            Thread.sleep(10000); 
        } catch (InterruptedException ex) {   
        }
        javafx.application.Platform.runLater(() -> {
            lbl1.setText("La liebre: Esta corriendo!");
        });
        liebre(55,100);
        }
      });
      espera2.setDaemon(true);
      espera2.start();
      espera.setDaemon(true);
      espera.start();  
      btn.setDisable(false);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    lbl2.setText("La tortuga: ");
    }
    
    public void tortuga(){
    for(int i=0;i<100;i++){
        pgb2.setProgress(i/100.0);
        try {
            Thread.sleep(170);
        } catch (InterruptedException ex) {
            
        }
      }
    pgb2.setProgress(-1);
    }
    
    public void liebre(int a,int b){
    for(int i=a;i<b;i++){
        pgb1.setProgress(i/100.0);
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            
        }
      }
    }
}
