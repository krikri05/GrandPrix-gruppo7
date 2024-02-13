/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grandprix7;

import java.util.ArrayList;

public class Giocatore {
    private String username;
    private int password;
    private ArrayList<String> arrayList;
        
    public Giocatore(final String username, final int password) {
        this.username = username;
        this.password = password;
        this.arrayList = new ArrayList();
    }
}
