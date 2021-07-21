package com.database.ormlibrary.order;

import javax.persistence.Embeddable;

@Embeddable
public class PriceEntity {
    private Float food;
    private Float deliveryPrice;

    public Float getFood() {
        return food;
    }

    public PriceEntity setFood(Float food) {
        this.food = food;
        return this;
    }

    public Float getDeliveryPrice() {
        return deliveryPrice;
    }

    public PriceEntity setDeliveryPrice(Float delivery) {
        this.deliveryPrice = delivery;
        return this;
    }

    public Float getTip() {
        return tip;
    }

    public PriceEntity setTip(Float tip) {
        this.tip = tip;
        return this;
    }

    private Float tip;
}
