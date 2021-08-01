package com.qwy.designpattern.lagou.builder;


/**
 *
 * 代表构建者的抽象基类（可以使用接口来代替）。
 *
 * 它定义了构建Product的步骤，它的子类（或者接口实现类）需要实现这些步骤。
 *
 * 同时，它还需要包含一个用来返回最终对象的方法getProduct()
 *
 */
public interface Builder {


    void buildPartA(int partA);

    void buildPartB(String partB);

    void buildPactC(int partC);

    Product getResult();
}
