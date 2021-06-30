package com.database.ormlibrary.food;

import com.database.ormlibrary.CoordinatesEmbeddable;

import javax.persistence.*;
import java.util.List;

@Entity
public class RestaurantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Long iconId;
    private Long backgroundId;
    private Integer averageTime; //minutes
    private Integer priceRating; //1-4
    private String address;
    @Embedded
    private CoordinatesEmbeddable coordinates;
    @OneToMany
    private List<PromotionsEntity> promotions;
    @OneToMany
    private List<MenuItemEntity> menu;
    @OneToMany
    private List<RestaurantRatingEntity> ratings;

    public Long getId() {
        return id;
    }

    public RestaurantEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RestaurantEntity setName(String name) {
        this.name = name;
        return this;
    }

    public Long getIconId() {
        return iconId;
    }

    public RestaurantEntity setIconId(Long iconId) {
        this.iconId = iconId;
        return this;
    }

    public Long getBackgroundId() {
        return backgroundId;
    }

    public RestaurantEntity setBackgroundId(Long backgroundId) {
        this.backgroundId = backgroundId;
        return this;
    }

    public Integer getAverageTime() {
        return averageTime;
    }

    public RestaurantEntity setAverageTime(Integer averageTime) {
        this.averageTime = averageTime;
        return this;
    }

    public Integer getPriceRating() {
        return priceRating;
    }

    public RestaurantEntity setPriceRating(Integer priceRating) {
        this.priceRating = priceRating;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public RestaurantEntity setAddress(String address) {
        this.address = address;
        return this;
    }

    public CoordinatesEmbeddable getCoordinates() {
        return coordinates;
    }

    public RestaurantEntity setCoordinates(CoordinatesEmbeddable coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    public List<MenuItemEntity> getMenu() {
        return menu;
    }

    public RestaurantEntity setMenu(List<MenuItemEntity> menu) {
        this.menu = menu;
        return this;
    }

    public List<RestaurantRatingEntity> getRatings() {
        return ratings;
    }

    public RestaurantEntity setRatings(List<RestaurantRatingEntity> ratings) {
        this.ratings = ratings;
        return this;
    }
}
