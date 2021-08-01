package com.qwy.designpattern.lagou.builder;


/**
 * 代表Builder类的具体实现类。
 */

public class ConcreteBuilder implements Builder {


    private int partA;
    private String partB;
    private int partC;

    @Override
    public void buildPartA(int partA) {
        this.partA = partA;

    }

    @Override
    public void buildPartB(String partB) {
        this.partB = partB;
    }

    @Override
    public void buildPactC(int partC) {
        this.partC = partC;
    }

    @Override
    public Product getResult() {
        return new Product(partA, partB, partC);
    }
}
