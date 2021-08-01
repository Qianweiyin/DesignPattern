package com.qwy.designpattern.lagou.builder;


/**
 *
 * 代表需要构造最终对象的某种算法。
 *
 * 这里通过使用构造函数Construct(Builder builder)来调用Builder的创建方法创建对象，
 *
 * 等创建完成后，再通过getProduct()方法来获取最终的完整对象。
 *
 */

public class Director {


    public void construct(Builder builder) {
        builder.buildPartA(1);
        builder.buildPartB("qianweiyin");
        builder.buildPactC(2);
    }
}
