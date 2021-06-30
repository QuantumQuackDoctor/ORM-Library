package com.database.ormlibrary.user;

import javax.persistence.*;
import java.util.Date;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String email;
    private String phone;
    private String firstName;
    private String lastName;
    private Boolean activated;
    private Date birthDate;
    private Boolean isVeteran;
    @ManyToOne
    private UserRoleEntity userRole;
    private Integer points;
    @Embedded
    private SettingsEntity settings;

    public Long getId() {
        return id;
    }

    public UserEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserEntity setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserEntity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Boolean getActivated() {
        return activated;
    }

    public UserEntity setActivated(Boolean activated) {
        this.activated = activated;
        return this;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public UserEntity setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public Boolean getVeteran() {
        return isVeteran;
    }

    public UserEntity setVeteran(Boolean veteran) {
        isVeteran = veteran;
        return this;
    }

    public UserRoleEntity getUserRole() {
        return userRole;
    }

    public UserEntity setUserRole(UserRoleEntity userRole) {
        this.userRole = userRole;
        return this;
    }

    public Integer getPoints() {
        return points;
    }

    public UserEntity setPoints(Integer points) {
        this.points = points;
        return this;
    }

    public SettingsEntity getSettings() {
        return settings;
    }

    public UserEntity setSettings(SettingsEntity settings) {
        this.settings = settings;
        return this;
    }
}
