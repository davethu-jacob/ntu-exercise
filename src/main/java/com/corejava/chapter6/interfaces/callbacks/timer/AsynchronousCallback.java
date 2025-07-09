package com.corejava.chapter6.interfaces.callbacks.timer;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsynchronousCallback {
    // Simulate an asynchronous task
    public static CompletableFuture<String> asyncTask() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(20000); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Async Task Completed!";
        });
    }

    public static void main(String[] args) {
        System.out.println("Starting async task...");

        // Call async task and define callback
        CompletableFuture<Void> future = asyncTask().thenAccept(result -> {
            System.out.println("Callback received: " + result);
        });

        // Do other work if needed
        System.out.println("Main thread continues...");

        // Wait for async task to complete before exiting
        try {
            future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("Main method finished.");
    }
}


