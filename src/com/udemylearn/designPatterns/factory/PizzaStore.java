package com.udemylearn.designPatterns.factory;

public class PizzaStore {
    public Pizza orderPizza(String pizzaType){
        Pizza pizza = PizzaFactory.createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        return pizza;
    }
}
