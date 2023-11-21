package org.courses.ex8_2;

import java.util.concurrent.TimeUnit;

public class FirstThread implements Runnable {
    @Override
    public void run() {
        for (int j = 0; j < 5; j++) {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("j = " + j + " " + Thread.currentThread().getName());
        }
        System.out.println("Завершення потоку " + Thread.currentThread().getName());
    }
}