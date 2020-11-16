package com.world.worldconnection.domain.enums;

public enum CPForCNPJ {

    PHYSICAL(1, "Pessoa Fisica"),
    LEGAL(2, "Pessoa Jurídica");

    private int code;
    private String description;

    CPForCNPJ(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
