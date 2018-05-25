package com.developerbhuwan.attendance;

import lombok.Value;

import static java.util.UUID.randomUUID;

@Value
public class UserId {

    private final String id;

    public static UserId newId() {
        return new UserId(randomUUID().toString());
    }
}
