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

    private String address;

    @OneToMany
    private List<FoodOrderEntity> items;

    @Embedded
    private OrderTimeEntity orderTimeEntity;

    @Embedded
    private  PriceEntity priceEntity;

    public OrderTimeEntity getOrderTimeEntity() {
        return orderTimeEntity;
    }

    public OrderEntity setOrderTimeEntity(OrderTimeEntity orderTimeEntity) {
        this.orderTimeEntity = orderTimeEntity;
        return this;
    }
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

    public DriverEntity getDriver() {
        return driver;
    }

    public OrderEntity setDriver(DriverEntity driver) {
        this.driver = driver;
        return this;
    }

    public List<FoodOrderEntity> getItems() {
        return items;
    }

    public OrderEntity setItems(List<FoodOrderEntity> items) {
        this.items = items;
        return this;
    }

    public PriceEntity getPriceEntity() {
        return priceEntity;
    }

    public OrderEntity setPriceEntity(PriceEntity priceEntity) {
        this.priceEntity = priceEntity;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public OrderEntity setAddress(String address) {
        this.address = address;
        return this;
    }

    private Boolean refunded;

    public boolean checkRequiredFields(){
        if (delivery == null || items == null
        || orderTimeEntity == null || priceEntity == null
        || address == null)
            return false;
        else
            return true;
    }
}
