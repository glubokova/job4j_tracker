package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }

        products[products.length - 1] = null;

        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Apple", 7);
        products[4] = new Product("Orange", 5);

        delete(products, 2);

        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName() + " - " + product.getCount());
            } else {
                System.out.println("null");
            }
        }
    }
}