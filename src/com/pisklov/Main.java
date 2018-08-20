package com.pisklov;

public class Main {

    public static void main(String[] args) {

        SSuper.printSSuper();
        Second.printSSuper();

        SSuper ss = new SSuper();
        ss.inter(2);

    }
}