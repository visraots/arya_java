package com.example.Threads;

public class extThread extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Thread 1 "+i);
        }
    }
}
