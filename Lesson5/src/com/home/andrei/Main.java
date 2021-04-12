package com.home.andrei;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel Core i9 9900 3100 МГц", "DDR4 16 ГБ", "960 ГБ", 10);
        computer.description();
        computer.on();
        computer.off();
        System.out.println();
        computer.on();
        computer.off();
    }
}
