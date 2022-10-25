package com.udemylearn.designPatterns.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable,Cloneable {
    //declare a static member(variable) and marks as volatile to avoid any issue in multi threading
    private static volatile DateUtil instance;

    // define the constructor as private so that no class can easily instatiate the class
    private DateUtil() {
    }

    // declare a static method to return just one instance of date util
    public static DateUtil getInstance(){
        //only instantiate if the instance is null, else return the instance
        //to make sure one thread uses the instance; introduce synchronize block and lock the class.
        if (instance == null){              // this helps to reduced usage of synchronization block since its very expensive to use
            synchronized (DateUtil.class){
                if (instance == null){
                    instance = new DateUtil();
                }
            }
        }
        return instance;
    }

    public Object readResolve(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
