package com.database.ormlibrary.order;

import com.database.ormlibrary.food.MenuItemEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class FoodOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToMany
    private List<MenuItemEntity> items;

    @OneToMany
    private List<OrderConfigurationEntity> configurations;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<MenuItemEntity> getItems() {
        return items;
    }

    public void setItems(List<MenuItemEntity> items) {
        this.items = items;
    }

    public List<OrderConfigurationEntity> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<OrderConfigurationEntity> configurations) {
        this.configurations = configurations;
    }

}
