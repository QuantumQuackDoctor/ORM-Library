package com.database.ormlibrary.food;

import javax.persistence.Embeddable;

@Embeddable
public class SearchEntity{
    private String searchPrimary; //term,term,term
    private String searchSecondary; //term,term,term

    public String getSearchPrimary() {
        return searchPrimary;
    }

    public SearchEntity setSearchPrimary(String primary) {
        this.searchPrimary = primary;
        return this;
    }

    public String getSearchSecondary() {
        return searchSecondary;
    }

    public SearchEntity setSearchSecondary(String secondary) {
        this.searchSecondary = secondary;
        return this;
    }
}
