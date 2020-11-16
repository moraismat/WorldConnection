package com.world.worldconnection.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.world.worldconnection.domain.enums.LanguageSpoken;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userType;

    private String fullName;
    private String dateBirth;
    private String numberTelephone;
    private String cellPhone;
    private String email;


    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "LanguageSpoken", joinColumns = @JoinColumn(name = "id"))
    private List<String> languageSpoken = new ArrayList<>();

    private String profession;

    @OneToOne
    @JsonManagedReference
    @JoinColumn(name = "dataSchool_id")
    private DataSchool dataSchool;

    @OneToOne
    @JsonManagedReference
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToOne
    @JsonManagedReference
    @JoinColumn(name = "residenceData_id")
    public  ResidenceData residenceData;

    public User() {}

    public User(Integer id, Integer userType, String fullName, String dateBirth, String numberTelephone, String email, String profession, DataSchool dataSchool, Address address, ResidenceData residenceData, String cellPhone) {
        this.id = id;
        this.userType = userType;
        this.fullName = fullName;
        this.dateBirth = dateBirth;
        this.numberTelephone = numberTelephone;
        this.email = email;
        this.profession = profession;
        this.dataSchool = dataSchool;
        this.address = address;
        this.residenceData = residenceData;
        this.cellPhone =cellPhone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getNumberTelephone() {
        return numberTelephone;
    }

    public void setNumberTelephone(String numberTelephone) {
        this.numberTelephone = numberTelephone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*public List<LanguageSpoken> getLanguageSpoken() {
        return languageSpoken;
    }

    public void setLanguageSpoken(List<LanguageSpoken> languageSpoken) {
        this.languageSpoken = languageSpoken;
    }*/

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public DataSchool getDataSchool() {
        return dataSchool;
    }

    public void setDataSchool(DataSchool dataSchool) {
        this.dataSchool = dataSchool;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ResidenceData getResidenceData() {
        return residenceData;
    }

    public void setResidenceData(ResidenceData residenceData) {
        this.residenceData = residenceData;
    }

    public List<String> getLanguageSpoken() {
        return languageSpoken;
    }

    public void setLanguageSpoken(List<String> languageSpoken) {
        this.languageSpoken = languageSpoken;
    }
}
