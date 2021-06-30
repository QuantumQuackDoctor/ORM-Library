package com.database.ormlibrary.user;

import javax.persistence.Embeddable;

@Embeddable
public class NotificationsEntity {

    private Boolean emailOption;
    private Boolean phoneOption;

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
