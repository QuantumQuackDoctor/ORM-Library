package com.database.ormlibrary.food;

import javax.persistence.Embeddable;

@Embeddable
public class SearchEntity{
    private String primary; //term,term,term
    private String secondary; //term,term,term

    public String getPrimary() {
        return primary;
    }

    public SearchEntity setPrimary(String primary) {
        this.primary = primary;
        return this;
    }

    public String getSecondary() {
        return secondary;
    }

    public SearchEntity setSecondary(String secondary) {
        this.secondary = secondary;
        return this;
    }
}
