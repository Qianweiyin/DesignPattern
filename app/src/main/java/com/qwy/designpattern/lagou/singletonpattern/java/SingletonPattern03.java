package com.qwy.designpattern.lagou.singletonpattern.java;


/**
 * 饿汉式
 */

public class SingletonPattern03 {
    // 这句就是饿汉模式的核心
    private static SingletonPattern03 SINGLETONPATTERN03 = new SingletonPattern03();

    public SingletonPattern03() {
    }


    public static SingletonPattern03 getInstance() {
        return SINGLETONPATTERN03;
    }
}
