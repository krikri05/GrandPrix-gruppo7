/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grandprix7;


public class Circuito {
  private String nome;
  private double lunghezzaCircuito;
  private int nGiri;
  private int nPit;

    public Circuito(String nome, double lunghezzaCircuito, int nGiri, int nPit) {
        this.nome = nome;
        this.lunghezzaCircuito = lunghezzaCircuito;
        this.nGiri = nGiri;
        this.nPit = nPit;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLunghezzaCircuito() {
        return lunghezzaCircuito;
    }

    public void setLunghezzaCircuito(double lunghezzaCircuito) {
        this.lunghezzaCircuito = lunghezzaCircuito;
    }

    public int getnGiri() {
        return nGiri;
    }

    public void setnGiri(int nGiri) {
        this.nGiri = nGiri;
    }

    public int getnPit() {
        return nPit;
    }

    public void setnPit(int nPit) {
        this.nPit = nPit;
    }
  
  

  
}
