package com.rghatkari.singleton.test;

import com.rghatkari.singleton.Singleton;
//import com.rghatkari.singleton.enumversion.Singleton;
//import com.rghatkari.singleton.singleThreadVersion.SingleThreadSingleton;
import com.rghatkari.singleton.lazyInitializing.LazyInitializedSingleton;

public class Test implements Runnable {
    public final static int MAX_THREAD = 500;

    @Override
    public void run() {
//        for (int i=0; i<MAX_THREAD; i++) {
//            System.out.println(Thread.currentThread().getName()+" : "+ Singleton.getInstance().hashCode());
//            SingleThreadSingleton threadSingleton = new SingleThreadSingleton();
            System.out.println(Thread.currentThread().getName()+" : "+ LazyInitializedSingleton.getInstance().hashCode());

//        }
    }
}
