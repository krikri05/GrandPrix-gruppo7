/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grandprix7;

import java.io.*;
import java.util.*;
import java.lang.Math;
import java.util.Scanner;



public class Gestore {
    public static void main(String[] args) {
        visualizza();
        Scanner sc = new Scanner(System.in);

    int s = -1;
    
    while (s != 0) {
    s = sc.nextInt();
    switch (s) {
      case 1:
       
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
        System.out.println("3)***********************************************************************************");
        int scelta = input.nextInt();
        
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
        
        
        
        System.out.println("Impostazioni circuito aggiornate!");
    
    }
}
