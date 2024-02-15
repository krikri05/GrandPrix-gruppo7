/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grandprix7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Giocatore {
    private String username;
    private int password;
    private ArrayList<String> automobili;
    private static boolean accesso=false;
        
    public Giocatore(final String username, final int password) {
        this.username = username;
        this.password = password;
        this.automobili = new ArrayList();
        
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
            accesso=true;
            System.out.println("\nStiamo effettuando l'accesso un secondo....\n");
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Gestore.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}