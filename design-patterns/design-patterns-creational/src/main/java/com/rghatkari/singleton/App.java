package com.rghatkari.singleton;

import com.rghatkari.singleton.test.Test;

/**
 * Singleton Design Pattern!
 * Date: 1st May 2020 COVID-19 Lockdown India.
 */
public class App {
    public final static int MAX_THREAD = 500;

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Singleton Design Pattern!");
        Singleton singleton1 = Singleton.getInstance();
//        System.out.println("instance 1: "+singleton1.hashCode());
        Singleton singleton2 = Singleton.getInstance();
//        System.out.println("instance 2: "+singleton2.hashCode());

        // testing with cloneable interface
//        Singleton singleton = singleton1.clone();
//        System.out.println("clone instance 3: "+singleton.hashCode());

        try {
            for (int i=0; i<MAX_THREAD; i++) {
                Thread t = new Thread(new Test());
                t.setName("T-"+i);
                t.start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
//        Test test1 = new Test();
//        Test test2 = new Test();
//        Test test3 = new Test();
//        Test test4 = new Test();
//
//        Thread thread1 = new Thread(test1);
//        Thread thread2 = new Thread(test2);
//        Thread thread3 = new Thread(test3);
//        Thread thread4 = new Thread(test4);
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
    }
}
