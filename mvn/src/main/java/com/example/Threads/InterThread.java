package com.example.Threads;

public class InterThread implements Runnable{

    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Thread 2 "+i);
        }
    }
}
