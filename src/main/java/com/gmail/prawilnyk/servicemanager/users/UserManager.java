package com.gmail.prawilnyk.servicemanager.users;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserManager {

    private final Map<UUID, User> users = new HashMap<>();

    public User getUser(UUID uniqueId) {
        return users.get(uniqueId);
    }

}
