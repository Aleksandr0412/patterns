package com.aleksandr0412.factory.lada.carbody;

import com.aleksandr0412.factory.CarBody;

public class LadaLuxBody implements CarBody {
    @Override
    public String getName() {
        return "Lada - lux body";
    }

    @Override
    public String getColor() {
        return "Lada - metall";
    }

    @Override
    public String getType() {
        return "Lada - sidan";
    }
}
