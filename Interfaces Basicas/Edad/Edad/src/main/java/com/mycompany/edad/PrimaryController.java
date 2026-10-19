package com.mycompany.edad;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.time.LocalDate;
import java.time.Period;

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
     int wa,anio,mes,dia;
     wa=Integer.parseInt(txt1.getText());
     anio=wa%10000;
     mes=(wa/10000)%100;
     dia=wa/1000000;
     
     //Fecha de referencia 19/10/2026
     LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
     LocalDate fechaActual = LocalDate.now();
     Period periodo = Period.between(fechaNacimiento, fechaActual);
     
    this.lbl2.setText("Tienes: "+periodo.getYears()+" anios con "+periodo.getMonths()+" meses");
                  }
    }

