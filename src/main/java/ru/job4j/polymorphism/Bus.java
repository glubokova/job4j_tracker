package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("Автобус движется");
    }

    @Override
    public void passengers(int count) {
        System.out.println("количество пассажиров: " + count);
    }

    @Override
    public int refuel(int fuel) {
        int price = 45;
        int cost = fuel * price;
        System.out.println("Заправлено " + fuel + " литров топлива. Стоимость: " + cost + " рублей.");
        return cost;
    }
}