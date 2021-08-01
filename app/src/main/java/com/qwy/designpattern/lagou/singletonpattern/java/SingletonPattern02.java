package com.qwy.designpattern.lagou.singletonpattern.java;

/**
 * 懒汉式（线程安全）
 */
public class SingletonPattern02 {

    private static SingletonPattern02 singletonPattern02;


    public SingletonPattern02() {
    }


    public static synchronized SingletonPattern02 getInstance() {
        //Instantiation of utility class 'SingletonPattern02'
        if (singletonPattern02 == null) {
            singletonPattern02 = new SingletonPattern02();
        }

        return singletonPattern02;
    }

}
