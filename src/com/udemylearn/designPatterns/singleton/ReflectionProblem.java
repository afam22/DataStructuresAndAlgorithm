package com.udemylearn.designPatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionProblem {
    public static void main(String[] args) {
        DateUtil instance1 = DateUtil.getInstance(); // creating as instance
        DateUtil instance2 = null;

        Constructor[] constructors = DateUtil.class.getDeclaredConstructors();
        for (Constructor constructor: constructors) {
            constructor.setAccessible(true); // making the constructor accessible since it is initially declared as private
            try {
                instance2 = (DateUtil) constructor.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
