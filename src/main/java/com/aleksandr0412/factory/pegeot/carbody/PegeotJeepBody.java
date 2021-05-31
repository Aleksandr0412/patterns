package com.aleksandr0412.factory.pegeot.carbody;

import com.aleksandr0412.factory.CarBody;

public class PegeotJeepBody implements CarBody {
    @Override
    public String getName() {
        return "Pegeot - jeep body";
    }

    @Override
    public String getColor() {
        return "Pegeot - metall";
    }

    @Override
    public String getType() {
        return "Pegeot - jeep";
    }
}
