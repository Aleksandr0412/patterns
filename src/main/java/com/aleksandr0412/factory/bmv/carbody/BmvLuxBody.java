package com.aleksandr0412.factory.bmv.carbody;

import com.aleksandr0412.factory.CarBody;

public class BmvLuxBody implements CarBody {
    @Override
    public String getName() {
        return "Bmw - lux body";
    }

    @Override
    public String getColor() {
        return "Bmw - metall";
    }

    @Override
    public String getType() {
        return "Bmw - sidan";
    }
}
