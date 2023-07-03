package ThreadPool.Dead_lock;

import ThreadPool.Dead_lock.Deadlock;

public class T2 extends Thread{
    public void run(){
        synchronized(Deadlock.s1){
            System.out.println("T2 using resource s1");
        }
    }

}
