package com.rghatkari.creational.singleton;

public class SingletonDriver {
    public static void main(String[] args){
        Singleton instance = Singleton.getInstance();
        System.out.println(instance.hashCode());
    }
}
