package ru.ayupov.task;

import java.util.*;

public class Order implements Basket {
    List<String> products = new ArrayList<>();
    List<Integer> productsQuantity = new ArrayList<>();

    @Override
    public void addProduct(String product, int quantity) {
        if (!products.contains(product)) {
            products.add(product);
            productsQuantity.add(quantity);
        } else {
            System.out.println("Продукт уже в корзине!");
            //updateProductQuantity(product, quantity);
        }
    }

    @Override
    public void removeProduct(String product) {
        int id = products.indexOf(product);
        if (id != -1) {
            products.remove(id);
            productsQuantity.remove(id);
        } else {
            System.out.println("Указанного продукта нет в корзине!");
        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (products.contains(product)) {
            int id = products.indexOf(product);
            productsQuantity.set(id, quantity);
        } else {
            System.out.println("Указанного продукта нет в корзине!");
            //this.addProduct(product, quantity);
        }
    }

    @Override
    public void clear() {
        products.clear();
        productsQuantity.clear();
    }

    @Override
    public List<String> getProducts() {
        if (!products.isEmpty()) {
            return products;
        }
        return products = new ArrayList<>();
    }

    @Override
    public int getProductQuantity(String product) {
        int id = products.indexOf(product);
        if (id != -1) {
            return productsQuantity.get(id);
        } else {
            System.out.println("Указанного продукта нет в корзине!");
        }
        return 0;
    }

    public void printOrder() {
        if (!products.isEmpty()) {
            for (String product : products) {
                System.out.printf("%-10s|%-3d%n", product, getProductQuantity(product));
            }
        }else {
            System.out.println("Корзина пуста!");
        }
        System.out.println();
    }
}
