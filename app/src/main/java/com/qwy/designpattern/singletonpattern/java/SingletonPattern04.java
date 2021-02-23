package com.qwy.designpattern.singletonpattern.java;


/**
 *
 * https://www.runoob.com/design-pattern/singleton-pattern.html
 *
 *
 * https://www.cnblogs.com/cxuanBlog/p/13338844.html
 *
 * 饿汉式
 *
 * 饿汉式与懒汉式的根本区别在：
 * 是否在类内部的方法外面，创建自己的对象。
 *
 * 并且声明对象都需要私有化，构造方法都要私有化，
 * 这样外部才不能通过new 对象的方式来访问。
 *
 * 饿汉式的话是声明并创建对象（因为他饿）
 *
 * 懒汉式的话只是声明对象，在调用该类的getInstance（）方法时才会进行new对象。
 */

public class SingletonPattern04 {

    private static SingletonPattern04 singletonPattern04;


    public SingletonPattern04() {
    }


    static {
        singletonPattern04 = new SingletonPattern04();
    }

    public static SingletonPattern04 getInstance() {
        return singletonPattern04;
    }

}
