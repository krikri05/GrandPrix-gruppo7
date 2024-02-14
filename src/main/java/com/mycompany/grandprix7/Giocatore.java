/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grandprix7;

import java.util.ArrayList;


public class Giocatore {
    private String username;
    private int password;
    private ArrayList<String> automobili;
        
    public Giocatore(final String username, final int password) {
        this.username = username;
        this.password = password;
        this.automobili = new ArrayList();
        
    }

    public String getUsername() {
        return username;
    }

    public int getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
    
}
