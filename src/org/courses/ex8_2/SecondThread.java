package org.courses.ex8_2;

import java.util.concurrent.TimeUnit;

public class SecondThread implements Runnable {
    @Override
    public void run() {
        for (int k = 0; k < 5; k++) {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("k = " + k + " " + Thread.currentThread().getName());
        }
        System.out.println("Завершення потоку " + Thread.currentThread().getName());
    }
}


