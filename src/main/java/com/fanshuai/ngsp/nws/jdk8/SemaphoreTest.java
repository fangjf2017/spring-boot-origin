package com.fanshuai.ngsp.nws.jdk8;

import java.util.concurrent.Semaphore;

/**
 * Created by fan on 2019/3/21.
 * test Semaphore
 */
public class SemaphoreTest {

    public static void main(String[] args) {
        int N = 8;
        //机器数目
        Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i < N; i++) {
            new Worker(i, semaphore).start();
        }
    }

    static class Worker extends Thread {
        private int i;
        private Semaphore semaphore;

        public Worker(int i, Semaphore semaphore) {
            this.i = i;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("工人" + this.i + "占用一个机器");
                Thread.sleep(1000);
                System.out.println("工人" + this.i + "释放出机器");
                semaphore.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
