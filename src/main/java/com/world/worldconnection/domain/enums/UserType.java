package com.world.worldconnection.domain.enums;

public enum UserType {

    FOREIGN(1, "Estrangeiro"),
    CANDIDATE(2, "Brasileiro");

    private int code;
    private String description;

    UserType(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static UserType toEnum(Integer code) {

        if(code == null){
            return null;
        }

        for(UserType x : UserType.values()){
            if(code.equals(x.getCode())){
                return x;
            }
        }
        throw new IllegalArgumentException("Id inválido: " + code);
    }
    
}
