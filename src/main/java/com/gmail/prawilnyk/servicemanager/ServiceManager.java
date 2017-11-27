package com.gmail.prawilnyk.servicemanager;

import com.gmail.prawilnyk.servicemanager.configuration.AppConfig;
import java.io.File;
import org.diorite.config.ConfigManager;

public class ServiceManager {

    private static ServiceManager INSTANCE;


    private final AppConfig config;

    public ServiceManager() {
        this.config = ConfigManager.createInstance(AppConfig.class);
        this.config.bindFile(new File("config.yml"));
        this.config.load();
        this.config.save();
    }


    public static void main(String[] args) {
        ServiceManager.INSTANCE = new ServiceManager();
    }

    public static ServiceManager getINSTANCE() {
        return INSTANCE;
    }

}
