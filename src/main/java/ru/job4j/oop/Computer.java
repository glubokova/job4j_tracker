package ru.job4j.oop;

import org.w3c.dom.ls.LSOutput;

public class Computer {
    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer() {
        Computer second = new Computer(true, 500, "Intel Core I7-10700K");
        second.printInfo();
    }

    public Computer(int ssd, String cpu) {
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
        System.out.println();
    }

        public static void main(String[] args) {
            Computer first = new Computer();
            first.printInfo();
            Computer third = new Computer(256, "AMD Ryzen 5 3600");
            third.printInfo();
        }
}