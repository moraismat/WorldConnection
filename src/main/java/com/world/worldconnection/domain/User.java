package com.world.worldconnection.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

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
    private ArrayList<String> cellPhone;
    private String email;
    private ArrayList<String> languageSpoken;
    private String profession;

    @OneToOne
    @JoinColumn(name = "dataSchool_id")
    private DataSchool dataSchool;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToOne
    @JoinColumn(name = "residenceData_id")
    public  ResidenceData residenceData;

    public User() {}

    public User(Integer id, Integer userType, String fullName, String dateBirth, String numberTelephone, ArrayList<String> cellPhone, String email, ArrayList<String> languageSpoken, String profession, DataSchool dataSchool, Address address, ResidenceData residenceData) {
        this.id = id;
        this.userType = userType;
        this.fullName = fullName;
        this.dateBirth = dateBirth;
        this.numberTelephone = numberTelephone;
        this.cellPhone = cellPhone;
        this.email = email;
        this.languageSpoken = languageSpoken;
        this.profession = profession;
        this.dataSchool = dataSchool;
        this.address = address;
        this.residenceData = residenceData;
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

    public ArrayList<String> getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(ArrayList<String> cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getLanguageSpoken() {
        return languageSpoken;
    }

    public void setLanguageSpoken(ArrayList<String> languageSpoken) {
        this.languageSpoken = languageSpoken;
    }

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
}
