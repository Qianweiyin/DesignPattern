package com.qwy.designpattern.lagou.singletonpattern.java;

/**
 * 静态内部类
 *
 */

public class SingletonPattern05 {


    private static class SingleHolder {
        private static final SingletonPattern05 INSTANCE = new SingletonPattern05();
    }


    public SingletonPattern05() {
    }


    public static final SingletonPattern05 getInstance() {
        return SingleHolder.INSTANCE;
    }
}
