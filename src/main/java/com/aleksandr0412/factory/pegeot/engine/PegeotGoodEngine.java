package com.aleksandr0412.factory.pegeot.engine;

import com.aleksandr0412.factory.Engine;

public class PegeotGoodEngine implements Engine {
    @Override
    public int getPower() {
        return 1000;
    }

    @Override
    public String getFuel() {
        return "Pegeot  - electricity";
    }
}
