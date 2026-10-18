package com.mycompany.edad;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML Label lbl1;
    @FXML Label lbl2;
    @FXML TextField txt1;
    @FXML Button btn_erase,btn_acep;
    
     @FXML 
     private void btn_erase(){
                   this.lbl2.setText("");
                   txt1.setText("");
                  }
     @FXML 
     private void btn_acep(){
     int wa,anio,mes,dia,edadanio,edadmes=0;
     wa=Integer.parseInt(txt1.getText());
     anio=wa%10000;
     mes=(wa/10000)%100;
     dia=wa/1000000;
     edadanio=2026-anio;
     //Fecha de referencia 19/10/2026
       if(10-mes<0){
       edadanio--;
       int x=10-mes;
       edadmes=12-Math.abs(x);
       if (dia>19)edadmes--;
       }else if(10-mes==0){
                    edadmes=(dia>19)?11:0;  
                }else{
                edadmes=10-mes;
                if (dia>19)edadmes--;
                }
       if (edadmes==11)edadanio--;
     
    this.lbl2.setText("Tienes: "+edadanio+" anios con "+edadmes+" meses");
                  }
    }

