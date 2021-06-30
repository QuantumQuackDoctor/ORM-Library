package com.database.ormlibrary.food;

import javax.persistence.*;

@Entity
public class ConfigurationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    private MenuItemEntity menuItem;
    private String configurationName;
}
