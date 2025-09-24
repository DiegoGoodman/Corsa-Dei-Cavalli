package com.example;

import java.util.ArrayList;

public class Classifica {

    public Classifica(){};
    private ArrayList<Cavallo> classifica = new ArrayList<>();

    synchronized public void aggiungiCavallo(Cavallo c){
        classifica.add(c);
    }

    public void stampa(){
        for (int i = 0; i < classifica.size(); i++) {
            System.out.println((i+1) + "° Posto: " + classifica.get(i).getNome());
        }
    }
}
