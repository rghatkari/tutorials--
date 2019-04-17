package com.rghatkari.singleton.lazyInitializing;

public class LazyInitializedSingletonTest {

    public static void main(String[] args) {
        LazyInitializedSingleton instance = LazyInitializedSingleton.getInstance();
        System.out.println(instance.hashCode());
    }
}
