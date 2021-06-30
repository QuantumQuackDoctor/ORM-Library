package com.database.ormlibrary.order;

import javax.persistence.Embeddable;

@Embeddable
public class PriceEntity {
    private Float food;
    private Float delivery;

    public Float getFood() {
        return food;
    }

    public PriceEntity setFood(Float food) {
        this.food = food;
        return this;
    }

    public Float getDelivery() {
        return delivery;
    }

    public PriceEntity setDelivery(Float delivery) {
        this.delivery = delivery;
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
