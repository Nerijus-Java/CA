package com.JavaCode.lessons.week7.day3.generic;

public class OrderedPair<K, V> implements Pair {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public Object getKey() {
        return key;
    }

    @Override
    public Object getValue() {
        return value;
    }
}
