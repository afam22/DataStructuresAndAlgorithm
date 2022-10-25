package com.udemylearn.designPatterns.factory;

public class PizzaStore {
    public Pizza orderPizza(String pizzaType){
        Pizza pizza = null;
        if (pizzaType.equals("cheese")){
            pizza = new CheesePizza();
        }else if (pizzaType.equals("chicken")){
            pizza = new ChickenPizza();
        }else if (pizzaType.equals("veggie")){
            pizza = new VeggiePizza();
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        return pizza;
    }
}
