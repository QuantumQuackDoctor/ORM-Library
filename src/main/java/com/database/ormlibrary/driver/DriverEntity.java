package com.database.ormlibrary.driver;

import com.database.ormlibrary.user.SettingsEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class DriverEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String phone;
    private String firstName;
    private String lastName;
    private String car; //blue something i don't know car names
    @Embedded
    private SettingsEntity settings;
    @OneToMany
    private List<DriverRatingEntity> ratings;

    public Long getId() {
        return id;
    }

    public DriverEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public DriverEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public DriverEntity setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public DriverEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public DriverEntity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public List<DriverRatingEntity> getRatings() {
        return ratings;
    }

    public DriverEntity setRatings(List<DriverRatingEntity> ratings) {
        this.ratings = ratings;
        return this;
    }

    public String getCar() {
        return car;
    }

    public DriverEntity setCar(String car) {
        this.car = car;
        return this;
    }

}
