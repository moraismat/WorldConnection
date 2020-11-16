package com.world.worldconnection.domain;


import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public String state;
    public String city;
    public String neighborhood;
    public String street;
    public int numberCode;
    public String complement;
    public int codePostal;

    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    public User user;

    public Address(){}

    public Address(Integer id, String state, String city, String neighborhood, String street, int numberCode, String complement, int codePostal) {
        this.id = id;
        this.state = state;
        this.city = city;
        this.neighborhood = neighborhood;
        this.street = street;
        this.numberCode = numberCode;
        this.complement = complement;
        this.codePostal = codePostal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberCode() {
        return numberCode;
    }

    public void setNumberCode(int numberCode) {
        this.numberCode = numberCode;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
