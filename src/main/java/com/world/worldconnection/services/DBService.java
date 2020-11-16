package com.world.worldconnection.services;

import com.world.worldconnection.domain.*;
import com.world.worldconnection.domain.enums.LanguageSpoken;
import com.world.worldconnection.repositories.AddressRepository;
import com.world.worldconnection.repositories.DataSchoolRepository;
import com.world.worldconnection.repositories.ResidenceDataRepository;
import com.world.worldconnection.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ResidenceDataRepository residenceDataRepository;

    @Autowired
    private DataSchoolRepository dataSchoolRepository;

    public void instantiateTestDataBase() throws ParseException {

        Address addressForeign = new Address(null, "New York", "New York","Queens", "spider street", 567, "apt Stark", 5670989);
        DataSchool dataSchool = new DataSchool(null, "College", "Sciencie Computer", "Columbia", "2021");
        UserForeign userForeign = new UserForeign(null, 1, "Peter Parker","09/10/1984",  "+55098555678901","peter_parker@gmail.com"
                , "Student", dataSchool, addressForeign, 5896555136484664L, "United States of America", "+5583998569851");

        userForeign.setLanguageSpoken(Arrays.asList("English", "Portuguese", "Germain"));

        Address addressCandidate = new Address(null, "Paraiba", "João Pessoa","Tambau", "rua monteiro lobato", 369, "apt 901", 58796321);
        DataSchool dataSchool2 = new DataSchool(null, "Pós-Graduação", "Letras", "UFPB", "2001");
        ResidenceData residenceData = new ResidenceData(null, "casa própria", 3,2,4,2,2,0,true,true,"carro");
        UserCandidate userCandidate = new UserCandidate(null, 2, "Eduardo Sousa", "10/02/1970", "+558332568954", "eduardosousa@hotmail.com",
                                                        "Professor", dataSchool2, addressCandidate, 908765432L, 10000.00, residenceData, 987568092L, 2, "+9858669875412");

        userCandidate.setLanguageSpoken(Arrays.asList("Portuguese"));

        residenceData.setUser(userCandidate);

        addressRepository.save(addressCandidate);
        addressRepository.save(addressForeign);

        dataSchoolRepository.save(dataSchool);
        dataSchoolRepository.save(dataSchool2);

        residenceDataRepository.save(residenceData);

        userRepository.save(userCandidate);
        userRepository.save(userForeign);


    }
}
