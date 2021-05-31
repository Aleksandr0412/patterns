package com.aleksandr0412.factory.bmv.engine;

import com.aleksandr0412.factory.Engine;

public class BmvBadEngine implements Engine {
    @Override
    public int getPower() {
        return 100;
    }

    @Override
    public String getFuel() {
        return "Disel";
    }
}
