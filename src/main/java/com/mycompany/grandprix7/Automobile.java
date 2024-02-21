/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grandprix7;


public class Automobile extends Thread {

    static void add(Automobile auto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String marca;
    private int velocita;
    private int numero;
    private String colore;

    public Automobile(String marca,int numero,int velocita,  String colore) {
        this.marca = marca;
        this.velocita = velocita;
        this.numero= numero;
        this.colore=colore;
    }


    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    @Override
    public void run() {
    
    }
}
