package com.world.worldconnection.domain;


import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class UserForeign extends User{

    public long numberDocument;
    public String originCountry;

    public UserForeign(){}

    public UserForeign(Integer id, Integer userType, String fullName, String dateBirth, String numberTelephone, String email, String profession, DataSchool dataSchool, Address address, long numberDocument, String originCountry, String cellPhone) {
        super(id, userType, fullName, dateBirth, numberTelephone, email,  profession, dataSchool, address, null, cellPhone);
        this.numberDocument = numberDocument;
        this.originCountry = originCountry;
    }


    public long getNumberDocument() {
        return numberDocument;
    }

    public void setNumberDocument(long numberDocument) {
        this.numberDocument = numberDocument;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

}
