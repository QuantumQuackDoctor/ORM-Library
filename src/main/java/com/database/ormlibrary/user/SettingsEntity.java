package com.database.ormlibrary.user;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class SettingsEntity {

    @Embedded
    private ThemesEntity themes;
    @Embedded
    private NotificationsEntity notifications;

    public ThemesEntity getThemes() {
        return themes;
    }

    public SettingsEntity setThemes(ThemesEntity themes) {
        this.themes = themes;
        return this;
    }

    public NotificationsEntity getNotifications() {
        return notifications;
    }

    public SettingsEntity setNotifications(NotificationsEntity notifications) {
        this.notifications = notifications;
        return this;
    }
}
