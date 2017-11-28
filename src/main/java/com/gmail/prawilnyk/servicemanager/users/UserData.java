package com.gmail.prawilnyk.servicemanager.users;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserData {

    //TODO uzueplnic o date urodzenie, numer dowodu, pesel, nip, dane firmy (user to też firma!)
    private String firstName;
    private String lastName;

    public UserData(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
