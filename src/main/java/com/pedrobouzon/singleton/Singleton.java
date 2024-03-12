package com.pedrobouzon.singleton;

import java.util.UUID;

public class Singleton {
    private static Singleton instance;
    private final UUID uuid;
    private Singleton(UUID uuid) {
        this.uuid = uuid;
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(UUID.randomUUID());
        }
        return instance;
    }

    public UUID getUuid() {
        return uuid;
    }
}
