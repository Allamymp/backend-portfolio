package com.Porfolio.Market.entities.enums;

public enum ContractType {

    EMPLOYEE_REGULAR(1),
    EMPLOYEE_OUTSOURCED(2),
    SERVICE(3),
    BUY(4);

    private int code;

    ContractType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
    public static ContractType valueOf(int code){
        for(ContractType value: ContractType.values()){
            if (value.getCode()==code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid ContractType code!");
    }
}
