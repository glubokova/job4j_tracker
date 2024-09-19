package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Garry Potter", 267);
        Book book2 = new Book("Game of Thrones", 709);
        Book book3 = new Book("Norwegian forest", 380);
        Book book4 = new Book("Clean code", 267);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        System.out.println("Replace:");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getNumberPages() + " страниц");
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        System.out.println("After replace");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getNumberPages() + " страниц");
        }

        System.out.println("Name Clean code:");
        for (int i = 0; i < books.length; i++) {
            if ("Clean code".equals(books[i].getName())) {
                System.out.println(books[i].getName() + " - " + books[i].getNumberPages() + " страниц");
            }
        }
    }
}