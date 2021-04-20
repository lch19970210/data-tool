package com.hangzhou.tool.blockchain;

public class BlockTest {
    public static void main(String[] args) {
        Block firstBlock = new Block("first block","0");
        System.out.println("firstBlock:"+firstBlock.hash);

        Block secondBlock = new Block("first block",firstBlock.hash);
        System.out.println("secondBlock:"+secondBlock.hash);

        Block thirdBlock = new Block("first block",secondBlock.hash);
        System.out.println("thirdBlock:"+thirdBlock.hash);
    }
}
