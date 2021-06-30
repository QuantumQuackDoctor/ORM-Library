package com.database.ormlibrary.food;

import javax.persistence.*;

@Entity
public class PromotionsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String condition;
    private String discount; //type:amount ex. %:2.4
}
