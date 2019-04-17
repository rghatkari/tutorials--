package com.rghatkari.singleton.singleThreadVersion;

public class SingleThreadSingleton {
    private SingleThreadSingleton resource;

    public SingleThreadSingleton getResource() {
        if (resource == null) {
            synchronized (this) {
                if (resource == null) {
                    resource = new SingleThreadSingleton();
                    return resource;
                }
            }

        }
        return resource;
    }
}
