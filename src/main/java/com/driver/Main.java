package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int product1 = p.product(10, 20);
        int product2 = p.product(10, 20, 30);
        double product3 = p.product(10.5, 20.5);
        System.out.println("product1 = " + product1);
        System.out.println("product2 = " + product2);
        System.out.println("product3 = " + product3);
    }

}