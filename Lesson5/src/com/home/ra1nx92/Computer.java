package com.home.ra1nx92;

import java.util.Scanner;

public class Computer {
    String processor;
    String operationMemory;
    String hardDrive;
    int cycleOnOff;
    Boolean turnedOn;
    boolean burnedOut;


    public Computer(String processor, String operationMemory, String hardDrive) {
        this.processor = processor;
        this.operationMemory = operationMemory;
        this.hardDrive = hardDrive;
    }

    public Computer(String processor, String operationMemory, String hardDrive, int cycleOnOff) {
        this.processor = processor;
        this.operationMemory = operationMemory;
        this.hardDrive = hardDrive;
        this.cycleOnOff = cycleOnOff;
    }

    public void computerInfo() {
        System.out.println("Модель процессора - " + processor + "\n" + "Оперативная память - " + operationMemory + "\n" + "Жесткий диск - " + hardDrive + "\n" + "Количество оставшихся циклов - " + cycleOnOff + "\n");
    }

    public boolean on() {
        System.out.println("Включение...");
        if (!burnedOut) {
            if (cycleOnOff != 0 && action()) {
                turnedOn = true;
                System.out.println("Компьютер включен");
                return true;
            } else {
                System.out.println("Компьютер горит");
                burnedOut = true;
                return false;
            }
        } else {
            System.out.println("Компьютер сгорел");
            return false;
        }
    }

    public void off() {
        if (turnedOn) {
            turnedOn = false;
            System.out.println("Компьютер выключен");
            cycleOnOff--;
        }
    }

    public boolean action() {
        System.out.println("Внимание! Введите 0 или 1");
        Scanner scan = new Scanner(System.in);
        while (true) {
            if (scan.hasNextLine()) {
                int x = scan.nextInt();
                if (x == 0 || x == 1) {
                    int rand = (int) (Math.random() * 2);
//                    return x == rand;
                    return true;
                }
            }
        }
    }

    public void numberOfCycles() {
        System.out.println("Циклов осталось - " + cycleOnOff);
    }
}