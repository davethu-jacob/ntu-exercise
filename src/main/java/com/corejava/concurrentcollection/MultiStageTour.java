package com.corejava.concurrentcollection;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MultiStageTour {
    public static final int NUMBER_OF_TOURIST = 5;
    public static final int NUMBER_OF_STAGES = 3;
    public static final CyclicBarrier barrier = new CyclicBarrier(NUMBER_OF_TOURIST, () -> {
        System.out.println("Tour guide starts speaking...");
    });

    public static void main(String[] args) {
        for (int i = 0; i < NUMBER_OF_TOURIST; i++) {
            Thread touristThread = new Thread(new Tourist(i));
            touristThread.start();
        }

    }

    static class Tourist implements Runnable {
        private final int touristId;

        Tourist(int touristId) {
            this.touristId = touristId;
        }

        @Override
        public void run() {
            for (int i = 0; i < NUMBER_OF_STAGES; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Tourist: " + touristId + " arrives at stage " + (i + 1));

                try {
                    barrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }

}

