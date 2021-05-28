package com.hangzhou.tool.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author linchenghui
 * @Date 2021/5/22
 */
public class Account {
    private Lock accountLock = new ReentrantLock();
    /**
     * 账户余额
     */
    private double balance;

    /**
     * 获得账户余额
     */
    public double getBalance() {
        return balance;
    }

    /**
     * 存款
     * @param money 存入金额
     */
    public void deposit(double money) {
        accountLock.lock();
        double newBalance = balance + money;
        try {
            // 模拟业务存钱处理时间
            Thread.sleep(10);
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            accountLock.unlock();
        }
        balance = newBalance;
    }

    public static void main(String[] args) {
        Account account = new Account();
        ExecutorService service = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            service.execute(new AddMoneyThread(account,1));
        }
        service.shutdown();
        while (!service.isTerminated()){}

        System.out.println("账户金额:" + account.getBalance());
    }
}
