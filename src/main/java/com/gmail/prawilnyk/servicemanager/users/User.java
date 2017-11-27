package com.gmail.prawilnyk.servicemanager.users;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private final UUID uniqueId;

    public User(UUID uniqueId) {
        this.uniqueId = uniqueId;
    }
}
