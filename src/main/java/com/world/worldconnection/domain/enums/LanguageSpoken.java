package com.world.worldconnection.domain.enums;

public enum LanguageSpoken {

    ENGLISH(1, "English"),
    PORTUGUESE(2, "Portuguese"),
    ITALIAN(4, "Italian"),
    SPANISH(5, "Spanish"),
    MANDARIN(6, "Mandarin"),
    JAPONESE(7, "Japonese"),
    GERMAN(8, "German"),
    DUTCH(9, "Dutch"),
    KOREAN(10, "Korean"),
    MEXICAN(11, "Mexican"),
    FRENCH(12, "French"),
    POLISH(13, "Polish"),
    RUSSIAN(14, "Russian");

    private int code;
    private String description;

    LanguageSpoken(int code, String description) {
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
