package com.aleksandr0412.factory.pegeot.engine;

import com.aleksandr0412.factory.Engine;

public class PegeotBadEngine implements Engine {
    @Override
    public int getPower() {
        return 100;
    }

    @Override
    public String getFuel() {
        return "Disel";
    }
}
