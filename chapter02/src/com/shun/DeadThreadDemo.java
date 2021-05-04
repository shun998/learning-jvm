package com.shun;

/**
 * @Author: layman
 * @Date:Create：in 2021/5/4 23:00
 * @Description:
 */
public class DeadThreadDemo {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + "开始");
            DeadThread dead = new DeadThread();
            System.out.println(Thread.currentThread().getName() + "结束");
        };
        Thread t1 = new Thread(r, "thread 1");
        Thread t2 = new Thread(r, "thread 2");
        t1.start();
        t2.start();
    }
}

class DeadThread {
    static {
        if (true) {
            System.out.println(Thread.currentThread().getName() + "初始化当前类");
            while (true) {

            }
        }
    }
}
