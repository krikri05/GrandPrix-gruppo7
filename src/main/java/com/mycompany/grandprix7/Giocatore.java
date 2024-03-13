
package com.mycompany.grandprix7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Giocatore {
    private String username;
    private int password;
    private static boolean accesso=false;
    private static int nAuto;
    private static Automobile[] arrayAuto = new Automobile[nAuto];
    private static Pilota[] arrayPiloti = new Pilota[nAuto];
  
        
    public Giocatore(final String username, final int password, boolean accesso, int nAuto) {
        this.username = username;
        this.password = password;
        this.accesso= accesso;
        this.nAuto=nAuto;
       
      
        
    }
public static void accedi() {
    Matrice m = new Matrice("VIGENERE");
    Vigenere v = new Vigenere(0,12,0,12,m);
    Vigenere v1 = new Vigenere(12,26,0,12,m);
    Vigenere v2 = new Vigenere(0,12,0,12,m);
    Vigenere v3 = new Vigenere(12,26,12,26,m);
    Thread t = new Thread(v);
    Thread t1 = new Thread(v1);
    Thread t2 = new Thread(v2);
    Thread t3 = new Thread(v3);
    
    t.start();
    t1.start();
    t2.start();
    t3.start();
    try{
    t.join();
    t1.join();
    t2.join();
    t3.join();
    }catch(InterruptedException ex){
    System.err.println("Errore nel metodo join!");
    }
    
  
    Scanner input = new Scanner(System.in);
    System.out.println("inserisci un usarname per accedere:");
    String username=input.nextLine();
    String verificaU=username.toUpperCase();
    
    
    System.out.println("inserisci una password:");
    String password=input.nextLine();
    String verificaP = password.toUpperCase();
    String passwordC=m.cifra(verificaP);
 

    Scrittore scrittore = new Scrittore("user.json", verificaU, passwordC);
    Thread threadScrittore = new Thread(scrittore);
    threadScrittore.start();

        try {
            threadScrittore.join();
             accesso=true;
              System.out.print("\nStiamo effettuando l'accesso un secondo");
             for(int i=0; i<6;i++){
                 Thread.sleep(500);
                 System.out.print(". ");
                 
             }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Gestore.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}
    public static boolean isAccesso() {
        return accesso;
    }
    
    public static void creazione(){
     Scanner input = new Scanner(System.in);
     System.out.println("insersci il numero d'auto che vuoi far partecipare:");
     nAuto= Integer.valueOf(input.nextLine());
    arrayAuto = new Automobile[nAuto];
    arrayPiloti = new Pilota[nAuto];
     for(int i=0; i<nAuto;i++){
         System.out.println("inserisci la marca dell'automobile:");
         String marca=input.nextLine();
          System.out.println("inserisci il colore che vuoi assegnare al automobile:");
         String colore=input.nextLine();
         System.out.println("inserisci il numero che utilizzera l auromobile e il pilota:");
         int numero= Integer.valueOf(input.nextLine());
         System.out.println("inserisci il nome del pilota:");
         String nome=input.nextLine();
         System.out.println("inserisci il cognome:");
         String cognome= input.nextLine();
         System.out.println("inserisci eta del pilota:");
         int eta= Integer.valueOf(input.nextLine());
         
         Automobile auto = new Automobile(colore, marca , numero);
         Pilota pilota= new Pilota(nome, cognome, numero, eta);
         arrayAuto[i] =  auto;
         arrayPiloti[i] = pilota;
     }

    
    }
   
    public static int getNauto(){
      return nAuto;
        
    }
    
    
    public void gareggia(){
        
    }
     public static void iniziaGara() {
    for (int i = 0; i < nAuto; i++) {
     
    
      
    }
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
         Thread.sleep(1000);
        } catch (InterruptedException e) {
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
        }
        
   for(int i=0; i<nGiri;i++){
       if(i==0){
           try {
         System.out.print("\nSTA PER INIZIARE ");
         Thread.sleep(1200);
          System.out.print("IL GRAN PREMIO DI " + nomeCircuito);
          Thread.sleep(1200);
          System.out.print("\nIL CIRCUITO E' LUNGO " + lunghezzaCircuito +"km" );
          Thread .sleep(1200);
          System.out.print(" I PILOTI DOVRANNO EFFETUARE " + nGiri + " GIRI");
          Thread.sleep(1200);
          System.out.print("\nIN CUI SARANNO OBBLIGATI A  " + nPit +" PIT STOP\n" );
          Thread.sleep(1200);
         System.out.print("SCHIERIAMO IN GRIGLIA I PARTECIPANTI A QUESTAM GARA: ");
          Thread.sleep(600);
        } catch (InterruptedException e) {
        }
           
           for (int s = 0;  s< nAuto; s++) {
               System.out.println("-----------------------------");
               System.out.println("Pilota " + (s + 1) + ": " + arrayPiloti[s]);
               System.out.println("-----------------------------");
    }
           
        }
       
      
       
               
    }
              

           
    }
    }
}
        
    
