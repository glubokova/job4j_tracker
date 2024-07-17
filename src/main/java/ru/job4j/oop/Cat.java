package ru.job4j.oop;

public class Cat {
    private String name;

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println("Имя котика: " + name + ". Он ел: рыбу.");
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        peppy.giveNick("Peppy");
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
        peppy.show();
    }
}