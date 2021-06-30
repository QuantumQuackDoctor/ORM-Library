package com.database.ormlibrary.order;

import javax.persistence.*;

@Entity
public class OrderConfigurationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String configurationName;

    public String getConfigurationName() {
        return configurationName;
    }

    public OrderConfigurationEntity setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
        return this;
    }
}
