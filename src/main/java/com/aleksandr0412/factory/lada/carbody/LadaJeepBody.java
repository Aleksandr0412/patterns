package com.aleksandr0412.factory.lada.carbody;

import com.aleksandr0412.factory.CarBody;

public class LadaJeepBody implements CarBody {
    @Override
    public String getName() {
        return "Lada - jeep body";
    }

    @Override
    public String getColor() {
        return "Lada - metall";
    }

    @Override
    public String getType() {
        return "Lada - jeep";
    }
}
