package org.courses.ex8_2;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();
        Thread thread1 = new Thread(firstThread, "First thread");
        thread1.start();
        Thread thread2 = new Thread(secondThread, "Second thread");
        thread2.start();
        System.out.println("Waiting for threads first and second");
        thread2.join();
        thread1.join();
        System.out.println("Завершення потоку main");
    }
}
