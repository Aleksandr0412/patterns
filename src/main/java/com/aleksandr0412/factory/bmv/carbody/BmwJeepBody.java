package com.aleksandr0412.factory.bmv.carbody;

import com.aleksandr0412.factory.CarBody;

public class BmwJeepBody implements CarBody {
    @Override
    public String getName() {
        return "Bmw - jeep body";
    }

    @Override
    public String getColor() {
        return "Bmw - metall";
    }

    @Override
    public String getType() {
        return "Bmw - jeep";
    }
}
