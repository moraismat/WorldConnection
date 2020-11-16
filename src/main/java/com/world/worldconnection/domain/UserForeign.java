package com.world.worldconnection.domain;


import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class UserForeign extends User{

    public long numberDocument;
    public String originCountry;

    public UserForeign(){}

    public UserForeign(Integer id, Integer userType, String fullName, String dateBirth, String numberTelephone, ArrayList<String> cellPhone, String email, ArrayList<String> languageSpoken, String profession, DataSchool dataSchool, Address address, long numberDocument, String originCountry) {
        super(id, userType, fullName, dateBirth, numberTelephone, cellPhone, email, languageSpoken, profession, dataSchool, address, null);
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
