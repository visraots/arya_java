package com.example.ThreadPool.Dead_lock;

public class T1 extends Thread{
    public void run(){
        synchronized(Deadlock.s1){
            System.out.println("T1 using resource s1");
        }
    }
}
