package com.world.worldconnection.domain;


import com.world.worldconnection.domain.enums.CPForCNPJ;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.ArrayList;

@Entity
public class UserCandidate extends User {

    public long rg;
    public double incomeFamily;
    public long numberDocument;
    public Integer cpfORcnpj;

    public UserCandidate() {
    }

    public UserCandidate(Integer id, Integer userType, String fullName, String dateBirth, String numberTelephone, ArrayList<String> cellPhone, String email, ArrayList<String> languageSpoken, String profession, DataSchool dataSchool, Address address, long rg, double incomeFamily, ResidenceData residenceData, long numberDocument, Integer cpfORcnpj) {
        super(id, userType, fullName, dateBirth, numberTelephone, cellPhone, email, languageSpoken, profession, dataSchool, address, residenceData);
        this.rg = rg;
        this.incomeFamily = incomeFamily;
        this.numberDocument = numberDocument;
        this.cpfORcnpj = cpfORcnpj;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public double getIncomeFamily() {
        return incomeFamily;
    }

    public void setIncomeFamily(double incomeFamily) {
        this.incomeFamily = incomeFamily;
    }

    public long getNumberDocument() {
        return numberDocument;
    }

    public void setNumberDocument(long numberDocument) {
        this.numberDocument = numberDocument;
    }

    public Integer getCpfORcnpj() {
        return cpfORcnpj;
    }

    public void setCpfORcnpj(Integer cpfORcnpj) {
        this.cpfORcnpj = cpfORcnpj;
    }
}
