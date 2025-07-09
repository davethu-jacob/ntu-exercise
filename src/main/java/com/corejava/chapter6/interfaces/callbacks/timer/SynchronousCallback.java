package com.corejava.chapter6.interfaces.callbacks.timer;

interface Callback {
    void onCallBack(String result);
}

class Worker {
    void doWork(Callback callback) {
        System.out.println("Worker: doing some work.....");

        // simulate some work
        String result = "Work complete";

        // Synchronous callback
        callback.onCallBack(result);
    }
}
public class SynchronousCallback {
    public static void main(String[] args) {
        Worker worker = new Worker();

        // call the worker and provide the feedback
        worker.doWork(new Callback() {
            @Override
            public void onCallBack(String result) {
                System.out.println("Caller: callback received with result: " + result);
            }
        });
        System.out.println("Caller: calling worker (after callback is completed).");
    }
}
