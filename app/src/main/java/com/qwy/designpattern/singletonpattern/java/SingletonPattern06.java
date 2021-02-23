package com.qwy.designpattern.singletonpattern.java;


/**
 * 双重校验锁（懒汉）（DCL，double- checked locking）
 *
 */
public class SingletonPattern06 {

    //静态变量
    private volatile static SingletonPattern06 INSTANCE;


    //私有构造函数
    public SingletonPattern06() {
    }


    public static SingletonPattern06 getInstance() {

        if (INSTANCE == null) { //第一层校验
            synchronized (SingletonPattern06.class) {
                if (INSTANCE == null) {// 第二层校验
                    INSTANCE = new SingletonPattern06();
                }
            }
        }

        return INSTANCE;
    }


}
