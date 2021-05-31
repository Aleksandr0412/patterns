package com.aleksandr0412.factory.lada.engine;

import com.aleksandr0412.factory.Engine;

public class LadaGoodEngine implements Engine {
    @Override
    public int getPower() {
        return 800;
    }

    @Override
    public String getFuel() {
        return "Lada  - electricity";
    }
}
