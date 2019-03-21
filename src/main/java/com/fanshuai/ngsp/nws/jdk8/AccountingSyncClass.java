package com.fanshuai.ngsp.nws.jdk8;

/**
 * Created by fan on 2019/3/19.
 * synchronized static method 静态方法synchronized是类锁
 */
public class AccountingSyncClass implements Runnable {

    static int i = 0;

    /**
     * 作用于静态方法,锁是当前class对象,也就是
     * AccountingSyncClass类对应的class对象
     */
    public static synchronized void increase() {
        i++;
    }

    @Override
    public void run() {
        for (int j = 0; j < 1000000; j++) {
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //new新实例
        Thread t1 = new Thread(new AccountingSyncClass());
        //new心事了
        Thread t2 = new Thread(new AccountingSyncClass());
        //启动线程
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
