package com.home.ramanhmr;

public class Main {
    public static void main(String[] args) {
        Computer pc1 = new Computer("Intel Pentium P5", 16, 2048, 3);
        System.out.println("check");
        pc1.describe();
        pc1.on();
        pc1.on();
        pc1.on();
        pc1.describe();
    }
}
