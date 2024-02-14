/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grandprix7;

import java.io.*;
import java.util.*;
import java.lang.Math;



public class Gestore {
    public static void main(String[] args) {
        visualizza();
        switch(scelta) {
            case "1" :
                break;
        }
    }

    public static void visualizza() {
        Scanner input = new Scanner(System.in);
        System.out.println("*************GRANPRIX****************\ncosa vuoi fare:\n 1-registra un giocatore\n 2-accedi\n");
        System.out.println("Inserisci il valore per scelta:");
        int scelta = input.nextInt();
        
    }
}
