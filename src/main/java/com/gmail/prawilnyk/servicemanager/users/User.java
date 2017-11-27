package com.gmail.prawilnyk.servicemanager.users;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private final UUID uniqueId;
    private final UserData userData;
    private final UserAddress userAddress;
    private UserPermissions userPermissions;

    public User(UUID uniqueId, UserData userData, UserAddress userAddress, UserPermissions userPermissions) {
        this.uniqueId = uniqueId;
        this.userData = userData;
        this.userAddress = userAddress;
    }
}
