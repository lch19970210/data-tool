package com.hangzhou.concurrent;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @Author linchenghui
 * @Date 2021/3/28
 */
public class MultiThread {
    public static void main(String[] args) {
        // 获取 Java 进程管理XMBEAN
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        // 获取线程和线程堆栈信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("[" + threadInfo.getThreadId() + "] "+threadInfo.getThreadName());
        }
    }
}
