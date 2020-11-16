package com.world.worldconnection.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ResidenceData implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public String typeResidence;
    public int countBedrooms;
    public int countWC;
    public int countPeople;
    public int countAdult;
    public int countChildren;
    public int countPets;
    public Boolean furnished;
    public Boolean vehicleAvailable;
    public String vehicle;

    @JsonIgnore
    @OneToOne(mappedBy = "residenceData", cascade = CascadeType.ALL)
    private User user;

    public ResidenceData(){
            }
    public ResidenceData(Integer id, String typeResidence, int countBedrooms, int countWC, int countPeople, int countAdult, int countChildren, int countPets, Boolean furnished, Boolean vehicleAvailable, String vehicle) {
        this.id = id;
        this.typeResidence = typeResidence;
        this.countBedrooms = countBedrooms;
        this.countWC = countWC;
        this.countPeople = countPeople;
        this.countAdult = countAdult;
        this.countChildren = countChildren;
        this.countPets = countPets;
        this.furnished = furnished;
        this.vehicleAvailable = vehicleAvailable;
        this.vehicle = vehicle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeResidence() {
        return typeResidence;
    }

    public void setTypeResidence(String typeResidence) {
        this.typeResidence = typeResidence;
    }

    public int getCountBedrooms() {
        return countBedrooms;
    }

    public void setCountBedrooms(int countBedrooms) {
        this.countBedrooms = countBedrooms;
    }

    public int getCountWC() {
        return countWC;
    }

    public void setCountWC(int countWC) {
        this.countWC = countWC;
    }

    public int getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    public int getCountAdult() {
        return countAdult;
    }

    public void setCountAdult(int countAdult) {
        this.countAdult = countAdult;
    }

    public int getCountChildren() {
        return countChildren;
    }

    public void setCountChildren(int countChildren) {
        this.countChildren = countChildren;
    }

    public int getCountPets() {
        return countPets;
    }

    public void setCountPets(int countPets) {
        this.countPets = countPets;
    }

    public Boolean getFurnished() {
        return furnished;
    }

    public void setFurnished(Boolean furnished) {
        this.furnished = furnished;
    }

    public Boolean getVehicleAvailable() {
        return vehicleAvailable;
    }

    public void setVehicleAvailable(Boolean vehicleAvailable) {
        this.vehicleAvailable = vehicleAvailable;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
