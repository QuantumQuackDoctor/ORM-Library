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

    @ManyToOne
    private MenuItemEntity item;
    @OneToMany
    private List<OrderConfigurationEntity> configurations;
}
