package com.pedrobouzon.singleton;

public class SingletonExample {

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().getUuid());
        System.out.println(Singleton.getInstance().getUuid());
    }
}

