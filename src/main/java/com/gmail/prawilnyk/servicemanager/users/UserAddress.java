package com.gmail.prawilnyk.servicemanager.users;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserAddress {

    private String country;
    private String city;
    private String street;
    private int buildingNumber;
    private int apartamentNumber;
    private String postalCode;
    private String postal;

}
