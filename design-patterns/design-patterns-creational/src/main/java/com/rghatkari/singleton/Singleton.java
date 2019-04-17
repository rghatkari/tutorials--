package com.rghatkari.singleton;

public class Singleton implements Cloneable{

    private Singleton() {

    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @Override
    public Singleton clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
}
