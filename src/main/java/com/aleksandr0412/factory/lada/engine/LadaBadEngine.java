package com.aleksandr0412.factory.lada.engine;

import com.aleksandr0412.factory.Engine;

public class LadaBadEngine implements Engine {
    @Override
    public int getPower() {
        return 100;
    }

    @Override
    public String getFuel() {
        return "Disel";
    }
}
