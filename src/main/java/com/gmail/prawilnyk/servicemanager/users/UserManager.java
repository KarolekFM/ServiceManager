package com.gmail.prawilnyk.servicemanager.users;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class UserManager {

    private final Map<UUID, User> users = new HashMap<>();

    public User getUser(UUID uniqueId) {
        return users.get(uniqueId);
    }

    public Set<User> getUsersByPermission(UserPermissions userPermissions) {
        Set<User> usersSet = new HashSet<>();
        users.values().forEach(user -> {
            if (user.getUserPermissions() == userPermissions) {
                usersSet.add(user);
            }
        });
        return usersSet;
    }

}
