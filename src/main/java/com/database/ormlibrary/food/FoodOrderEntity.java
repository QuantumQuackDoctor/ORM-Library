package com.database.ormlibrary.food;

import com.database.ormlibrary.order.OrderEntity;

import javax.persistence.*;

@Entity
public class FoodOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    private MenuItemEntity item;
    @ManyToOne
    private OrderEntity order;

}
