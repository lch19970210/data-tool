package com.hangzhou.tool.lru;

/**
 * @Author linchenghui
 * @Date 2021/5/23
 */
public class LRUCacheDemo {
    /**
     * 构造一个 Node 节点作为数据载体
     * @param <K> 键
     * @param <V> 值
     */
    class Node<K,V> {
        K key;
        V value;
        Node<K,V> prev;
        Node<K,V> next;

        public Node() {
            this.prev = this.next = null;
        }

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.prev = this.next = null;
        }
    }

}
