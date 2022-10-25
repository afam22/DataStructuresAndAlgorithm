package com.udemylearn.designPatterns.singleton;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DateUtil dateUtil1 = DateUtil.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\New folder\\Programming2022\\singletonDocs\\dateUtil.ser")));
        oos.writeObject(dateUtil1);

//        DateUtil dateUtil2 = DateUtil.getInstance();
        DateUtil dateUtil2 = null;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\New folder\\Programming2022\\singletonDocs\\dateUtil.ser"));
        dateUtil2 = (DateUtil) ois.readObject();

        oos.close();
        ois.close();

        System.out.println(dateUtil1== dateUtil2);
    }
}
