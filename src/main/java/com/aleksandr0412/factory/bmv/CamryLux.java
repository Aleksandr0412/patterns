package com.aleksandr0412.factory.bmv;

import com.aleksandr0412.factory.Engine;
import com.aleksandr0412.factory.CarBody;
import com.aleksandr0412.factory.Interior;
import com.aleksandr0412.factory.Lux;
import com.aleksandr0412.factory.bmv.carbody.BmvLuxBody;
import com.aleksandr0412.factory.bmv.engine.BmwGoodEngine;
import com.aleksandr0412.factory.bmv.interior.BmvLuxInterior;

public class CamryLux implements Lux {
    private Engine engine;
    private CarBody carBody;
    private Interior interior;

    protected CamryLux() {
        engine = new BmwGoodEngine();
        carBody = new BmvLuxBody();
        interior = new BmvLuxInterior();
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public CarBody getCarBody() {
        return carBody;
    }

    @Override
    public Interior getInterior() {
        return interior;
    }
}
