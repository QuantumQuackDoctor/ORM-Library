package com.database.ormlibrary.order;

import com.database.ormlibrary.driver.DriverEntity;
import com.database.ormlibrary.food.MenuItemEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Boolean delivery;
    @ManyToOne(targetEntity = DriverEntity.class, cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    private DriverEntity driver;
    private String restaurantNote;
    private String driverNote;
    private Boolean active;
    @OneToMany
    private List<FoodOrderEntity> items;

    public Long getId() {
        return id;
    }

    public OrderEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public OrderEntity setDelivery(Boolean delivery) {
        this.delivery = delivery;
        return this;
    }

    public String getRestaurantNote() {
        return restaurantNote;
    }

    public OrderEntity setRestaurantNote(String restaurantNote) {
        this.restaurantNote = restaurantNote;
        return this;
    }

    public String getDriverNote() {
        return driverNote;
    }

    public OrderEntity setDriverNote(String driverNote) {
        this.driverNote = driverNote;
        return this;
    }

    public Boolean getActive() {
        return active;
    }

    public OrderEntity setActive(Boolean active) {
        this.active = active;
        return this;
    }

    public Boolean getRefunded() {
        return refunded;
    }

    public OrderEntity setRefunded(Boolean refunded) {
        this.refunded = refunded;
        return this;
    }

    private Boolean refunded;
}
