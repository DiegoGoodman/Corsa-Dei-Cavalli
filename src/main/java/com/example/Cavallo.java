package com.example;

public class Cavallo extends Thread{
    public void run(){
        for (int i = 0; i <= 60; i++) {
            System.out.println(i);
        }
    }
}
