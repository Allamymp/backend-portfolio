package com.Porfolio.Market.entities.enums;

public enum ContractStatus {
    ON(1),
    OFF(2),
    SUSPENDED(3);

    private int code;

    ContractStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
    public static ContractStatus valueOf(int code){
        for(ContractStatus value: ContractStatus.values()){
            if (value.getCode()==code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid ContractStatus code!");
    }
}
