package com.rghatkari.creational.singleton;

public class Singleton {
    private static Singleton INSTANCE;
    private Singleton(){}

    public static Singleton getInstance(){
        if(INSTANCE ==  null){
            return new Singleton();
        }
        return INSTANCE;
    }
}
