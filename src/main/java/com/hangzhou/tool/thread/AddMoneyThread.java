package com.hangzhou.tool.thread;

/**
 * @Author linchenghui
 * @Date 2021/5/22
 */
public class AddMoneyThread implements Runnable{
    /**
     * 银行账户
     */
    private Account account;
    /**
     * 金额
     */
    private double money;

    public AddMoneyThread(Account account, double money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        account.deposit(money);
    }
}
