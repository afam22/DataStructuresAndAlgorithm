package com.udemylearn.designPatterns.singleton;

public enum EnumSingletonDemo {
    INSTANCE;
     private String name;
     public String getName(){
         return name;
     }

    public void setName(String name) {
        this.name = name;
    }
}