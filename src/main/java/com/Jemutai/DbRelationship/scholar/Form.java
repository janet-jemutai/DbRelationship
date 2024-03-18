package com.Jemutai.DbRelationship.scholar;

import lombok.Data;



public enum Form {
    CONSTANT1(1),
    CONSTANT2(2),
    CONSTANT3(3),
    CONSTANT4(4);

    private  final  int value;

    Form(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}


