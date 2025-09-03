package okta.saml.configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTes {

    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(2);


        executor.submit(() -> {
            System.out.println("Task executed by " + Thread.currentThread().getName());
        });

        executor.shutdown();
    }
}
