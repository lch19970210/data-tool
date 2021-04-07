package com.hangzhou.concurrent;

import java.util.concurrent.TimeUnit;

/**
 * 优雅的暂停线程
 * @Author linchenghui
 * @Date 2021/4/6
 */
public class Shutdown {
    public static void main(String[] args) throws InterruptedException {
        Runner one = new Runner();
        Thread interruptThread = new Thread(one, "interruptThread");
        interruptThread.start();
        // 睡眠一秒,main线程对 interruptThread 进行中断使 interruptThread 能够感知中断而结束
        TimeUnit.SECONDS.sleep(1);
        interruptThread.interrupt();

        Runner two = new Runner();
        Thread cancleThread = new Thread(two, "cancleThread");
        cancleThread.start();
        // 睡眠一秒,main线程对 cancleThread 进行取消,使 cancleThread 能够感知on为false而中断
        TimeUnit.SECONDS.sleep(1);
        two.cancle();
    }

    private static class Runner implements Runnable{
        private long i;

        private volatile boolean on = true;

        @Override
        public void run() {
            while (on && !Thread.currentThread().isInterrupted()){
                i++;
            }
            System.out.println("Count i = " + i);
        }

        public void cancle(){
            on = false;
        }
    }
}
