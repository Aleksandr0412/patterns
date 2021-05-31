package com.aleksandr0412.factory.lada.carbody;

import com.aleksandr0412.factory.CarBody;

public class LadaCheepBody implements CarBody {
    @Override
    public String getName() {
        return "Lada - cheep body";
    }

    @Override
    public String getColor() {
        return "Lada - white";
    }

    @Override
    public String getType() {
        return "Lada - sidan";
    }
}
