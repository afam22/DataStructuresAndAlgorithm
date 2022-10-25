package com.udemylearn.designPatterns.factory;

public class Test {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("chicken");
    }
}
