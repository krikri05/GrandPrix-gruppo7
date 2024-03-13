/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grandprix7;

import java.util.Random;

/**
 *
 * @author Kristian
 */
public class Automobile extends Thread {

    
    private String marca;
    private String colore;
    private int numeroAuto;

    public Automobile(String colore, String marca, int nAuto) {
        this.marca = marca;
        this.colore = colore;
        this.numeroAuto=numeroAuto;
    }

    public String getMarca() {
        return marca;
    }

    public String getColore() {
        return colore;
    }

    public int getnAuto() {
        return numeroAuto;
    }
     
    public void gareggia(){
     Random random = new Random();
     

    }
    
    @Override
    public void run() {
        
         gareggia();
    }
}
