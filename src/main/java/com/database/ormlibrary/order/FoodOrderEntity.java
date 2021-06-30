package com.database.ormlibrary.order;

import com.database.ormlibrary.food.MenuItemEntity;
import com.database.ormlibrary.order.OrderEntity;

import javax.persistence.*;

//@Entity
public class FoodOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    private MenuItemEntity item;
    @ManyToOne(targetEntity = OrderEntity.class, fetch = FetchType.LAZY)
    private OrderEntity order;

}
