package com.database.ormlibrary.food;

import com.database.ormlibrary.user.UserEntity;

import javax.persistence.*;

@Entity
public class RestaurantRatingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    private UserEntity user;
    private String imageId;
    private Integer stars;
    private String description;
}