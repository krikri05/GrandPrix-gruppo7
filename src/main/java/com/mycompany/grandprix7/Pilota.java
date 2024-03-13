/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grandprix7;

/**
 *
 * @author Kristian
 */
public class Pilota{

    static void add(Pilota pilota) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String nome;
    private String cognome;
    private int numeroPilota;
    private int eta;

    public Pilota(String nome, String cognome, int numeroPilota, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroPilota = numeroPilota;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getNumeroPilota() {
        return numeroPilota;
    }

    public int getEta() {
        return eta;
    }
    
    @Override
	public String toString() {
		return nome+" "+cognome +" "+ numeroPilota + " "+eta;
	}
}
