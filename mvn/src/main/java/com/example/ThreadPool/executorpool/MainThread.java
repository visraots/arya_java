package com.example.ThreadPool.executorpool;


public class MainThread implements Runnable{
    int s;
    int e;
    int[] a=new int[5];

    int c=0;
    int ii=0;
    public MainThread(int s,int e){
        this.s=s;
        this.e=e;

    }
    @Override
    public void run() {

        for (int i=s;i<e;i++){
            c=c+i;
        }
        ii+=c;


        Executorpool.sum+=c;



    }

}
