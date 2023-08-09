package com.hiddenpirates.dialer.helpers;

public class CounterSingleton {

    private static CounterSingleton instance;
    private int counter;

    private CounterSingleton() {
        counter = 0;
    }

    public static synchronized CounterSingleton getInstance() {
        if (instance == null) {
            instance = new CounterSingleton();
        }
        return instance;
    }

    public synchronized int getCounter() {
        return counter;
    }

    public synchronized void incrementCounter() {
        counter++;
    }
}
