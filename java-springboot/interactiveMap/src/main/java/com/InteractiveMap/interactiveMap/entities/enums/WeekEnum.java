package com.InteractiveMap.interactiveMap.entities.enums;

public enum WeekEnum {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7),
    ;

    private int code;

    private WeekEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static WeekEnum valueOf(int code) {
        for (WeekEnum value : WeekEnum.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid WeekEnum code!");
    }
}
