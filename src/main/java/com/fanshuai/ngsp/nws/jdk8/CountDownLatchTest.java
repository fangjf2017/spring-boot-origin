package com.fanshuai.ngsp.nws.jdk8;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by fan on 2019/3/21.
 * test CountDownLatch
 */
public class CountDownLatchTest {

    public static void main(String[] args) {
        final CountDownLatch latch = new CountDownLatch(2);
        new Thread() {
            @Override
            public void run() {
                System.out.println("子线程" + Thread.currentThread().getName() + "正在执行");
                try {
                    Thread.sleep(3000);
                    System.out.println("子线程" + Thread.currentThread().getName() + "执行完毕");
                    //将count值间1
                    latch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.run();

        new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("子线程" + Thread.currentThread().getName() + "正在执行");
                    Thread.sleep(3000);
                    System.out.println("子线程" + Thread.currentThread().getName() + "执行完毕");
                    //将count值间1
                    latch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        try {
            System.out.println("等待2个子线程执行完毕...");
            //调用await()方法的线程会被挂起，它会等待直到count为0时才继续执行
//            latch.await();
            //和await()类似，只不过等待一定的时间后count值还没变为0的话就会继续执行
            latch.await(1, TimeUnit.SECONDS);
            System.out.println("等待1s,继续执行主线程");
            System.out.println("2个线程已经执行完毕");
//            System.out.println("继续执行主线程");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
