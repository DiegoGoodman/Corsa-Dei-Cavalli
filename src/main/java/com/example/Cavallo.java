package com.example;

public class Cavallo extends Thread{
    private Classifica classifica;
    private String nome;

    public Cavallo(String nome, Classifica classifica){
        this.nome = nome;
        this.classifica = classifica;
    }

    public String getNome() {
        return nome;
    }

    public void run(){
        for (int i = 0; i <= 60; i++) {
            System.out.println(nome + ": " + i);
        }
        classifica.aggiungiCavallo(this);
    }
}
