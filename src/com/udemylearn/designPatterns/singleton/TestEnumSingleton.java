package com.udemylearn.designPatterns.singleton;

public class TestEnumSingleton {
    public static void main(String[] args) {
        EnumSingletonDemo instance = EnumSingletonDemo.INSTANCE;
        System.out.println(instance.getName());
        instance.setName("Afam");
        System.out.println(instance.getName());
    }
}
