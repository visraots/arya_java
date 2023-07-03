package ThreadPool.executorpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executorpool {
    static int sum=0;
    public static void main(String [] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        for(int i=0;i<5;i++){
            int s=i*20;
            int e=s+20;
            es.execute(new MainThread(s,e));
        }

        es.shutdown();
        System.out.println(Executorpool.sum);
    }

}
