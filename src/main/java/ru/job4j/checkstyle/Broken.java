package ru.job4j.checkstyle;

public class Broken {
    private int sizeOfEmpty = 10;
    private String name;
    public String surname;
    public static final String NEWVALUE = "";

    public Broken() {
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method(int a, int b, int c) {
        int num = a + b + c;
        System.out.println(num);
    }
}