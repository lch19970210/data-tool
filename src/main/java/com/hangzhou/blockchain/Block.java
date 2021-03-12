package com.hangzhou.blockchain;

import java.util.Date;

/**
 * 区块
 */
public class Block {
    /**
     * 自身的hash值(数据签名)
     */
    public String hash;
    /**
     * 前一个区块的hash值(数据签名)
     */
    public String previousHash;
    /**
     * 加密数据(加密货币)
     */
    private String data;
    /**
     * 时间戳
     */
    private long timeStamp;

    /**
     * 区块构造器
     * @param data hash值
     * @param previousHash 前一个区块的hash值
     */
    public Block(String data,String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = this.calculateHash();
    }

    /**
     * 根据 前一个区块的 hash 值和时间戳和自身的加密数据获得下一个区块的 hash 值
     * @return 下一个区块的 hash 值
     */
    public String calculateHash() {
        String calculatedhash = SimpleHashAlgorithm.applySha256(
                previousHash +
                        Long.toString(timeStamp) +
                        data
        );
        return calculatedhash;
    }
}
