/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grandprix7;

/**
 *
 * @author Kristian
 */
public class Automobile extends Thread {

    
    private String marca;
    private String colore;
    private int nAuto;

    public Automobile(String colore, String marca, int nAuto) {
        this.marca = marca;
        this.colore = colore;
        this.nAuto=nAuto;
    }
    static void add(Automobile auto) {
        
    }

 

    
    @Override
    public void run() {
    
    }
}
