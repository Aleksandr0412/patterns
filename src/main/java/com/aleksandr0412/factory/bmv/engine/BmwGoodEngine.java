package com.aleksandr0412.factory.bmv.engine;

import com.aleksandr0412.factory.Engine;

public class BmwGoodEngine implements Engine {
    @Override
    public int getPower() {
        return 10000;
    }

    @Override
    public String getFuel() {
        return "Bmw  - electricity";
    }
}
