package com.database.ormlibrary.order;

import javax.persistence.Embeddable;

@Embeddable
public class PriceEntity {
    private Float foodPrice;
    private Float deliveryPrice;

    public Float getFoodPrice() {
        return foodPrice;
    }

    public PriceEntity setFoodPrice(Float food) {
        this.foodPrice = food;
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
