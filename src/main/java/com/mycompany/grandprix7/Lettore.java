/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grandprix7;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Kristian
 */
public class Lettore extends Thread{
    String nomeFile;
    
    
    public Lettore(String nomeFile){
        this.nomeFile = nomeFile;
    }
    
    /**
     * Legge il file senza tener conto del tipo di file
     * e se lo salva su uno StringBuilder
     * @return sb.toString()
     */
    public String leggi(){
        StringBuilder sb= new StringBuilder();
        int i; 
         //1) apro il file
        try( FileReader  fr = new FileReader(nomeFile)) { 
            //2) leggo carattere per carattere e lo stampo 
            while ((i=fr.read()) != -1)
               sb.append((char) i);
            System.out.print("\n\r");
            //3) chiudo il file
            fr.close();
        } catch (IOException ex) {
            System.err.println("Errore in lettura!");
        }
        return sb.toString();
    }
    

    @Override
    public void run(){
        System.out.println(leggi());
    }
}