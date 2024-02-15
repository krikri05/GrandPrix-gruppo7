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
    private String nome;
    private int velocita;
    private String marca;
    private Boolean safetyCar;

    public Automobile(String nome, int velocita, String marca, Boolean safetyCar) {
        this.nome = nome;
        this.velocita = velocita;
        this.marca = marca;
        this.safetyCar = safetyCar;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setSafetyCar(Boolean safetyCar) {
        this.safetyCar = safetyCar;
    }
    
    @Override
    public void run() {
    
    }
}
