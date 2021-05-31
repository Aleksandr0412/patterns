package com.aleksandr0412.factory.bmv.carbody;

import com.aleksandr0412.factory.CarBody;

public class BmvCheepBody implements CarBody {
    @Override
    public String getName() {
        return "Bmw - cheep body";
    }

    @Override
    public String getColor() {
        return "Bmw - white";
    }

    @Override
    public String getType() {
        return "Bmw - sidan";
    }
}
