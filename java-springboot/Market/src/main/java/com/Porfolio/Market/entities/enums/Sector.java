package com.Porfolio.Market.entities.enums;

public enum Sector {

    ADMINISTRATIVE(1),
    SECURITY(2),
    SALES(3),
    CASHIER(4),
    MAINTENANCE(5),
    HUMAN_RESOURCES(6),
    BUTCHER(7),
    COLD_DAIRY(8),
    FISH(9),
    DRINKS(10),
    HYGIENE_BEAUTY(11),
    CLEANING(12),
    VEGETABLES(13),
    FROZEN(14),
    COOKIES(15),
    GROCERY(16);

    private int code;

    Sector(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Sector valueOf(int code){
        for(Sector value: Sector.values()){
            if (value.getCode()==code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid Sector code!");
    }

}
