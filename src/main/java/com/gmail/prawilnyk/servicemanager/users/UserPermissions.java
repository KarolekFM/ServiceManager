package com.gmail.prawilnyk.servicemanager.users;

import lombok.Getter;

public enum UserPermissions {

    ADMINISTRATOR(3),
    OWNER(2),
    EMPLOYEE(1),
    CUSTOMER(0);

    @Getter
    private final int power;

    UserPermissions(int power) {
        this.power = power;
    }

    public static UserPermissions getByPower(int power) {
        for (UserPermissions permission : UserPermissions.values()) {
            if (permission.getPower() == power) {
                return permission;
            }
        }
        return null;
    }

}
