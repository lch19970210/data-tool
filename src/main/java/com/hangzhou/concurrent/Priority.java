package com.hangzhou.concurrent;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * 通过构造优先级不同的线程和在规定时间内的计数来说明程序的正确性不能以来线程的优先级高低
 * @Author linchenghui
 * @Date 2021/3/28
 */
public class Priority {
    private static volatile boolean notStart = true;
    private static volatile boolean notEnd = true;

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            // 构造五个优先级最低的线程和五个优先级最低的线程
            int priority = i < 5 ? Thread.MIN_PRIORITY : Thread.MAX_PRIORITY;
            Job job = new Job(priority);
            jobs.add(job);
            // 构造线程
            Thread thread = new Thread(job, "Thread:" + i);
            thread.setPriority(priority);
            thread.start();
        }

        notStart = false;
        // main 线程休眠10秒
        TimeUnit.SECONDS.sleep(10);
        notEnd = false;
        jobs.stream().forEach(item -> {
            System.out.println("Job Priority: "+ item.priority + ", Count: " + item.jobCount);
        });
    }

    static class Job implements Runnable{
        private int priority;
        private long jobCount;

        public Job (int priority){
            this.priority = priority;
        }

        @Override
        public void run() {
            while (notStart){
                // 礼让线程(让cpu重新调度线程)
                Thread.yield();
            }

            while (notEnd){
                Thread.yield();
                jobCount++;
            }
        }
    }

}
