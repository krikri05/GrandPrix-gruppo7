/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grandprix7;

import java.util.Scanner;


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
    public static void impostazioniCircuito() {
        
       Scanner scanner1 = new Scanner(System.in);
       //if(accesso=true){
           System.out.println("prima di poter accedere a questa sezione devi aver conseguito accesso");
       //}else{
           System.out.println("Scrivi il nome del circuito: ");
           String nomeCircuito = scanner1.nextLine();
           System.out.println("Scegli la lunghezza del circuito(in Km): ");
           Double lunghezzaCircuito = scanner1.nextDouble();
           System.out.println("Imposta il numero di giri: ");
           int nGiri = scanner1.nextInt();
           System.out.println("Imposta il numero di pit stop: ");
           int nPit = scanner1.nextInt();
           Circuito circuito= new Circuito(nomeCircuito,lunghezzaCircuito, nGiri,nPit);
      // }
        
        
        
    
    }
}