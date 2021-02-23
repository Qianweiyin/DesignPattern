package com.qwy.designpattern.singletonpattern.java;


/**
 * 懒汉式（线程不安全）
 */

public class SingletonPattern01 {

    //私有的静态变量
    private static SingletonPattern01 singletonPattern;


    public SingletonPattern01() {
    }


    //暴露的公有静态方法
    public static SingletonPattern01 getInstance() {
        //Instantiation of utility class 'SingletonPattern'
        if (singletonPattern == null) {
            singletonPattern = new SingletonPattern01();
        }
        return singletonPattern;
    }

}
