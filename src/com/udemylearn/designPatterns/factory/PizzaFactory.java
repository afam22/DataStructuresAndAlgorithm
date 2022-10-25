package com.udemylearn.designPatterns.factory;

public class PizzaFactory {
    public static Pizza createPizza(String pizzaType){
        Pizza pizza = null;
        if (pizzaType.equals("cheese")){
            pizza = new CheesePizza();
        }else if (pizzaType.equals("chicken")){
            pizza = new ChickenPizza();
        }else if (pizzaType.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
