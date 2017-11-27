package com.gmail.prawilnyk.servicemanager.configuration;

import org.diorite.config.Config;

public interface AppConfig extends Config {

    default String getMysqlUrl() {
        return "jdbc:mysql://localhost:3306/servicemanager";
    }

    void setMysqlUrl(String host);

    default String getMysqlUsername() {
        return "root";
    }

    void setMysqlUsername(String username);

    default String getMysqlPassword() {
        return "";
    }

    void setMysqlPassword(String password);

}
