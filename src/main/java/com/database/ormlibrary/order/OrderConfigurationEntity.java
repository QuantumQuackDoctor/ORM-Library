package com.database.ormlibrary.order;

import javax.persistence.*;

@Entity
public class OrderConfigurationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    private OrderEntity orderEntity;
    private String configurationName;

    public OrderEntity getOrderEntity() {
        return orderEntity;
    }

    public OrderConfigurationEntity setOrderEntity(OrderEntity orderEntity) {
        this.orderEntity = orderEntity;
        return this;
    }

    public String getConfigurationName() {
        return configurationName;
    }

    public OrderConfigurationEntity setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
        return this;
    }
}
