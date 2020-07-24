package ru.ayupov.task;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();

        order.addProduct("хлеб", 2);
        order.addProduct("молоко", 1);
        order.addProduct("яица", 10);

        order.printOrder();

        order.removeProduct("молоко");

        order.printOrder();

        order.updateProductQuantity("хлеб", 1);
        order.updateProductQuantity("яица", 20);

        order.printOrder();

        order.clear();

        order.printOrder();
    }
}
