package com.corejava.multithreading.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class WorkLoadSplitter extends RecursiveAction {
    private final long workLoad;

    public WorkLoadSplitter(long workLoad) {
        this.workLoad = workLoad;
    }

    @Override
    protected void compute() {
        if (workLoad > 16) {
            System.out.println("Work Load too big! Thus splitting: " + workLoad);

            long firstWorkLoad = workLoad / 2;
            long secondWorkLoad = workLoad - firstWorkLoad;

            WorkLoadSplitter firstSplit = new WorkLoadSplitter(firstWorkLoad);
            WorkLoadSplitter secondSplit = new WorkLoadSplitter(secondWorkLoad);

            firstSplit.fork();
            secondSplit.fork();
        } else {
            System.out.println("Work load within limits. Task is being executed for work load: " + workLoad);
        }
    }
}

class WorkLoadSplitDemo {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        WorkLoadSplitter splitter = new WorkLoadSplitter(128);
        pool.invoke(splitter);
    }
}
