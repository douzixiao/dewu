package com.youkeda.dewu.control;

/**
 * @program: dewu.app
 * @description: 测试类
 * @author: douzi
 * @create: 2021-03-30 09:36
 **/


public class Test {
    private static   long  count = 0;
    public static void main(String[] args) {
        calc();

    }

    private void add10K() {
        int idx = 0;
        while(idx++ < 10000) {
            count += 1;
        }
    }
    public static long calc() {
        final Test test = new Test();
        // 创建两个线程，执行add()操作
        Thread th1 = new Thread(()->{
            test.add10K();
        });
        Thread th2 = new Thread(()->{
            test.add10K();
        });
        // 启动两个线程
        th1.start();
        th2.start();
        // 等待两个线程执行结束
        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count);
        return 0;
    }
}