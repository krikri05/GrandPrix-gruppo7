/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grandprix7;


import java.io.*;
import java.util.*;
import java.lang.Math;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Gestore {
    public static void main(String[] args) {
        visualizza();
         Lettore l = new Lettore("user.json");
        Scanner sc = new Scanner(System.in);

    int s = -1;
    
    while (s != 0) {
    s = sc.nextInt();
    switch (s) {
      case 1:
        accedi();
        break;
      case 2:
        impostazioniCircuito();
        break;
      case 3:
        
        break;
    }
  }
    }

    public static void visualizza() {
        Scanner input = new Scanner(System.in);
        System.out.println("*************************************************************************************");
        System.out.println("************************************GRAND PRIX***************************************");
        System.out.println("*************************************************************************************");
        System.out.println("Seleziona una di queste scelte:******************************************************");
        System.out.println("1)Accedi con username e password*****************************************************");
        System.out.println("2)Impostazioni Circuito**************************************************************");
        System.out.println("0)chiudi*****************************************************************************");
        int sc = input.nextInt();
        
    }
    
    public static void impostazioniCircuito() {
        
       Scanner scanner1 = new Scanner(System.in);
       
        System.out.println("Scrivi il nome del circuito: ");
        String nomeCircuito = scanner1.nextLine();
        System.out.println("Scegli la lunghezza del circuito(in Km): ");
        Double lunghezzaCircuito = scanner1.nextDouble();
        System.out.println("Imposta il numero di giri: ");
        int nGiri = scanner1.nextInt();
        System.out.println("Imposta il numero di pit stop: ");
        int nPit = scanner1.nextInt();
        Circuito circuito= new Circuito(nomeCircuito,lunghezzaCircuito, nGiri,nPit);
        
        
        
        System.out.println("Impostazioni circuito aggiornate!");
    
    }
    
    public static void accedi() {
    boolean accesso=false;
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
    
  
    //l.start();
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
            Thread.sleep(2000);
            threadScrittore.join();
            
            System.out.println("\nStiamo effettuando l'accesso un secondo....\n");
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Gestore.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
}
