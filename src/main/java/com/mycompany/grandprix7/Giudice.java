
package com.mycompany.grandprix7;

import java.util.Scanner;

public class Giudice{
  private String classificaFinale;
  
  
public Giudice(String classificaFinale) {
    this.classificaFinale = classificaFinale;
}
   
public static void iniziogara(){
    if(Giocatore.isAccesso()==false){
        try {
         System.out.println("prima di poter accedere a questa sezione devi aver conseguito accesso");
         Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         
       }else{
       
    Scanner sc = new Scanner(System.in);
     try {
          System.out.println("inseriamo le impostazioni di gara");
         Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    System.out.print("inserisci il nome del circuito: ");
    String nomeCircuito=sc.nextLine();
    System.out.print("inserisci la lunghezza del circuito espresso in km: ");
    Double lunghezzaCircuito = sc.nextDouble();
    System.out.print("Imposta il numero di giri: ");
    int nGiri = sc.nextInt();
    System.out.print("Imposta il numero di pit stop: ");
    int nPit = sc.nextInt();
  try {
          System.out.print("\nAVVIO GARA IN CORSO");
          for(int s=0; s<7; s++){
          Thread.sleep(700);
          System.out.print(". ");
          }           
         
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
   for(int i=0; i<nGiri;i++){
       if(i==0){
           try {
         System.out.print("\nSTA PER INIZIARE ");
         Thread.sleep(1200);
          System.out.print("IL GRAN PREMIO DI " + nomeCircuito);
          Thread.sleep(1200);
          System.out.print("\nIL CIRCUITO E' LUNGO " + lunghezzaCircuito +"km" );
          Thread.sleep(1200);
          System.out.print(" IL PILOTI DOVRANNO EFFETUARE " + nGiri + " GIRI");
          Thread.sleep(1200);
          System.out.print("\nIN CUI EFFETTUERANNO OBBLIGATORIAMENTE " + nPit +" PIT STOP" );
          Thread.sleep(1200);
         
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

           
       }
      
    }
    }
}
}