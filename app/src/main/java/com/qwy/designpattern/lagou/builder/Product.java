package com.qwy.designpattern.lagou.builder;

/***
 *
 * 代表最终构建的对象，比如，汽车类，计算机类
 */
public class Product {
    private int partA;
    private String partB;
    private int partC;

    public Product(int partA, String partB, int partC) {
        this.partA = partA;
        this.partB = partB;
        this.partC = partC;
    }

    @Override
    public String toString() {
        return "Product{" +
                "partA=" + partA +
                ", partB='" + partB + '\'' +
                ", partC=" + partC +
                '}';
    }
}
