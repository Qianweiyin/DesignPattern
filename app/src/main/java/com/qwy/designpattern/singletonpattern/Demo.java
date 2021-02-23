package com.qwy.designpattern.singletonpattern;

import com.qwy.designpattern.singletonpattern.java.SingletonPattern07;

public class Demo {

    public static void main(String[] args) {


        test();

    }


    public static void test() {
        SingletonPattern07 s1 = SingletonPattern07.SINGLETON_PATTERN_07;
        SingletonPattern07 s2 = SingletonPattern07.SINGLETON_PATTERN_07;
        System.out.print("t1和t2的地址是否相同：" + (s1 == s2));
    }

}
