package com.qwy.designpattern.singletonpattern.java;


/**
 * 枚举
 */
public enum SingletonPattern07 {
    SINGLETON_PATTERN_07;


    SingletonPattern07() {
        System.out.println("枚举创建对象了");
    }

    public void doSomething() {
        System.out.println("这是枚举类型的单例模式！");
    }
}