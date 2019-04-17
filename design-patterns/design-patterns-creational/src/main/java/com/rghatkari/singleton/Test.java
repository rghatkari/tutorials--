package com.rghatkari.singleton;

import java.util.concurrent.atomic.AtomicLong;

public class Test {

    static AtomicLong i = new AtomicLong();
    static {
        Thread t = new Thread(() -> i.getAndIncrement());
        t.start();
        try{t.join();} catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.print(i.get());
    }
}
