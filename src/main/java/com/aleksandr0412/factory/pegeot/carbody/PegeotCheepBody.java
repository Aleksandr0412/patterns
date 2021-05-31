package com.aleksandr0412.factory.pegeot.carbody;

import com.aleksandr0412.factory.CarBody;

public class PegeotCheepBody implements CarBody {
    @Override
    public String getName() {
        return "Pegeot - cheep body";
    }

    @Override
    public String getColor() {
        return "Pegeot - white";
    }

    @Override
    public String getType() {
        return "Pegeot - sidan";
    }
}
