package com.fanshuai.ngsp.nws.jdk8;

/**
 * Created by fan on 2019/3/19.
 */
public class AccountingSyncNew implements Runnable {
    static AccountingSyncNew instance = new AccountingSyncNew();
    static int i = 0;

    @Override
    public void run() {
        //省略其他耗时操作....
        //使用同步代码块对变量i进行同步操作,锁对象为instance
        synchronized (instance) {
            for (int j = 0; j < 1000000; j++) {
                i++;
            }
        }
        //this,当前实例对象锁
//        synchronized (this){
//
//        }
        //class对象锁
//        synchronized (AccountingSyncNew.class){
//
//        }
    }


    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}

