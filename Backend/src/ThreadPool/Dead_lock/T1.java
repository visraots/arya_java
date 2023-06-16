package ThreadPool.Dead_lock;

import ThreadPool.Dead_lock.Deadlock;

public class T1 extends Thread{
    public void run(){
        synchronized(Deadlock.s1){
            System.out.println("T1 using resource s1");
        }
    }
}
