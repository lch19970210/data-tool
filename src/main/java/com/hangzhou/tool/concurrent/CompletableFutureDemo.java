package com.hangzhou.tool.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.*;

/**
 * CompletableFuture 练习
 * @Author linchenghui
 * @Date 2021/4/20
 */
public class CompletableFutureDemo {

    public static ExecutorService executor = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 异步任务

//        CompletableFuture<Object> future = CompletableFuture.completedFuture("");

//        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("当前线程: " + Thread.currentThread().getId());
//            int i = 10 / 0;
//            System.out.println("运行结果: " + i);
//            return i;
//        }, executor)
//                // 获取返回结果和异常
//                .whenComplete((result,exception) -> {
//                    System.out.println("异步任务结束,结果是 " + result +",异常是 " + exception);
//                })
//                // 感知异常并做出相关操作
//                .exceptionally(throwable -> {
//                    return 1024;
//                });
//        Integer result = future.get();
//        System.out.println("main Thread: " + result);

        // 串行
//        CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(() -> {
//            System.out.println("当前线程: " + Thread.currentThread().getId());
//            int i = 10 / 0;
//            System.out.println("运行结果: " + i);
//            return i;
//        }, executor).thenRunAsync(() -> {
//            System.out.println("当前线程: " + Thread.currentThread().getId());
//        }, executor);
//        System.out.println("main Thread: " + Thread.currentThread().getId());

        // 任务组合
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            return "hello";
        }, executor);

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            return "world";
        }, executor);

        CompletableFuture<String> future = future1.thenCombineAsync(future2, (f1, f2) -> {
            return f1 + " " + f2;
        }, executor);

        System.out.println(future.get());
    }
}
