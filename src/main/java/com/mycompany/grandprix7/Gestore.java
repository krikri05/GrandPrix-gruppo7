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
      
      
         Lettore l = new Lettore("user.json");
        Scanner sc = new Scanner(System.in);

    int s = -1;
    
    while (s != 0) {
        visualizza();
        s = sc.nextInt();
    switch (s) {
        
      case 1:
        Giocatore.accedi();
        break;
      case 2:
       
        break;
      case 3:
        Giudice.iniziogara();
        break;
      case 0:
          break;
    }
  }
    }

    public static void visualizza() {
        System.out.println("*************************************************************************************");
        System.out.println("************************************GRAND PRIX***************************************");
        System.out.println("*************************************************************************************");
        System.out.println("Seleziona una di queste scelte:******************************************************");
        System.out.println("1)Accedi con username e password*****************************************************");
        System.out.println("2)Impostazioni Circuito**************************************************************");
        System.out.println("3)avvia gara*************************************************************************");
        System.out.println("0)chiudi*****************************************************************************");
        
    }
    
    
   
    
    }

