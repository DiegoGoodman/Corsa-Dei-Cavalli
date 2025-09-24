package com.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Classifica c = new Classifica();
        Cavallo c1 = new Cavallo("Cavallo1", c);
        Cavallo c2 = new Cavallo("Cavallo2", c);
        Cavallo c3 = new Cavallo("Cavallo3", c);
        Cavallo c4 = new Cavallo("Cavallo4", c);

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        c1.join();
        c2.join();
        c3.join();
        c4.join();

        System.out.println("Gara finita!");

        c.stampa();
    }
}