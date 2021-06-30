package com.database.ormlibrary.driver;

import javax.persistence.*;

@Entity
public class DriverRatingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    private DriverEntity driver;
    private Integer stars;
    private String description;
}
