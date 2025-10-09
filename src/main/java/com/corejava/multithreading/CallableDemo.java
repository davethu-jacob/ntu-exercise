package com.corejava.multithreading;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        try (ExecutorService service = Executors.newFixedThreadPool(2)) {
           Future<Integer> result =  service.submit(new ReturnValueTask());

            System.out.println("Return value: " + result.get());
            System.out.println("Main thread execution completed...");
        }
    }
}


class ReturnValueTask implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
//        Thread.sleep(5000);
        return 99;
    }
}