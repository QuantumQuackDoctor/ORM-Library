package com.database.ormlibrary.order;

import com.database.ormlibrary.food.MenuItemEntity;
import com.database.ormlibrary.order.OrderEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class FoodOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToMany
    private List<OrderConfigurationEntity> configurations;

    @ManyToOne
    private MenuItemEntity item;

    public Long getId() {
        return id;
    }

    public FoodOrderEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public MenuItemEntity getItem() {
        return item;
    }

    public FoodOrderEntity setItem(MenuItemEntity item) {
        this.item = item;
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
