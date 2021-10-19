package com.database.ormlibrary.user;

import javax.persistence.Embeddable;

@Embeddable
public class NotificationsEntity {

    private Boolean emailOption;
    private Boolean emailOrder;
    private Boolean emailDelivery;
    private Boolean phoneOption;

    public Boolean getEmailOrder() {
        return emailOrder;
    }

    public NotificationsEntity setEmailOrder(Boolean emailOrder) {
        this.emailOrder = emailOrder;
        return this;
    }

    public Boolean getEmailDelivery() {
        return emailDelivery;
    }

    public NotificationsEntity setEmailDelivery(Boolean emailDelivery) {
        this.emailDelivery = emailDelivery;
        return this;
    }

    public Boolean getEmail() {
        return emailOption;
    }

    public NotificationsEntity setEmail(Boolean emailOption) {
        this.emailOption = emailOption;
        return this;
    }

    public Boolean getPhoneOption() {
        return phoneOption;
    }

    public NotificationsEntity setPhoneOption(Boolean phoneOption) {
        this.phoneOption = phoneOption;
        return this;
    }
}
