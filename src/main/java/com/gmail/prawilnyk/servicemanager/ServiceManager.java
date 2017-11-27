package com.gmail.prawilnyk.servicemanager;

import com.gmail.prawilnyk.servicemanager.configuration.AppConfig;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.io.File;
import lombok.Getter;
import org.diorite.config.ConfigManager;

@Getter
public class ServiceManager {

    private static ServiceManager INSTANCE;


    private final AppConfig config;
    private final HikariDataSource dataSource;

    public ServiceManager() {
        this.config = initializeConfig();
        this.dataSource = initializeHikariDataSource();
    }

    private AppConfig initializeConfig() {
        AppConfig config = ConfigManager.createInstance(AppConfig.class);
        config.bindFile(new File("config.yml"));
        config.load();
        config.save();
        return config;
    }

    private HikariDataSource initializeHikariDataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(getConfig().getMysqlUrl());
        config.setUsername(getConfig().getMysqlUsername());
        config.setPassword(getConfig().getMysqlPassword());
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        return new HikariDataSource(config);
    }


    public static void main(String[] args) {
        ServiceManager.INSTANCE = new ServiceManager();
    }

    public static ServiceManager getINSTANCE() {
        return INSTANCE;
    }

}
