package com.corejava.multithreading.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CpuIntensiveTask {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of cores: " + cores);
        System.out.println("Total memory: " + Runtime.getRuntime().totalMemory());
        ExecutorService service = Executors.newFixedThreadPool(cores);
        System.out.println("Created thread pool with: " + cores + " cores");

        for (int i = 0; i < 30; i++) {
            service.execute(new CpuTask());
        }

    }
}

class CpuTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Some CPU intensive task is being executed by: " + Thread.currentThread().getName());
    }
}
