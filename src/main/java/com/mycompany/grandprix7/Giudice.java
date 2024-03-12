
package com.mycompany.grandprix7;

import java.util.Scanner;

public class Giudice {
  private String classificaFinale;
  
  
public Giudice(String classificaFinale) {
    this.classificaFinale = classificaFinale;
}
   
public static void iniziogara(){
    if(Giocatore.isAccesso()==false){
           System.out.println("prima di poter accedere a questa sezione devi aver conseguito accesso");
       }else{
    Scanner sc = new Scanner(System.in);
    System.out.println("inseriamo le impostazioni di gara");
    System.out.print("inserisci il nome del circuito: ");
    String nomeCircuito=sc.nextLine();
    System.out.print("inserisci la lunghezza del circuito espresso in km: ");
    Double lunghezzaCircuito = sc.nextDouble();
    System.out.println("Imposta il numero di giri: ");
    int nGiri = sc.nextInt();
    System.out.println("Imposta il numero di pit stop: ");
    int nPit = sc.nextInt();
    
    
    System.out.println("inizia il granPremio di " + nomeCircuito + "il circuito ha la lunghezza di ben " + lunghezzaCircuito + "km i piloti dovranno effetuare ben " + nGiri+ " giri\n" + " in cui andranno ad effetuare " + nPit + "pit stop obbligatori");// aggiungere il get nome (opzionale lunghezza e numero giri)
    
   // for(int i=0; i<circuito.getnGiri();i++){
   // System.out.println("inizia il gran premio" + circuito.getLunghezzaCircuito());
        
    //}
    }
}
}