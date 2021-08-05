package com.database.ormlibrary.order;

import com.database.ormlibrary.food.MenuItemEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class FoodOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToMany (fetch = FetchType.EAGER)
    private List<OrderConfigurationEntity> configurations;

    private Long restaurantId;

    @ManyToMany
    private List<MenuItemEntity> orderItems;

    public Long getId() {
        return id;
    }

    public FoodOrderEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public List<MenuItemEntity> getOrderItems() {
        return orderItems;
    }

    public FoodOrderEntity setOrderItems(List<MenuItemEntity> orderItem) {
        this.orderItems = orderItem;
        return this;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public FoodOrderEntity setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
        return this;
    }

    public List<OrderConfigurationEntity> getConfigurations() {
        return configurations;
    }

    public FoodOrderEntity setConfigurations(List<OrderConfigurationEntity> configurations) {
        this.configurations = configurations;
        return this;
    }

}
