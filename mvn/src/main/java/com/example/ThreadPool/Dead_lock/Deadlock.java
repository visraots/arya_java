package com.example.ThreadPool.Dead_lock;

public class Deadlock {
    static String s1="Arya";
    public static void main(String [] args){
        Thread t=new T1();
        Thread t1=new T2();
        t.start();
        t1.start();
    }
}
