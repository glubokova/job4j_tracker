package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + divide(y) + multiply(y);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        result = minus(5 );
        Calculator calculator = new Calculator();
        result = calculator.multiply(5);
        System.out.println(result);
        Calculator calc = new Calculator();
        result = calculator.divide(5);
        System.out.println(result);
    }
}
