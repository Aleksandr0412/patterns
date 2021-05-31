package com.aleksandr0412.factory.bmv;

import com.aleksandr0412.factory.Engine;
import com.aleksandr0412.factory.CarBody;
import com.aleksandr0412.factory.Interior;
import com.aleksandr0412.factory.Jeep;
import com.aleksandr0412.factory.bmv.carbody.BmwJeepBody;
import com.aleksandr0412.factory.bmv.engine.BmwGoodEngine;
import com.aleksandr0412.factory.bmv.interior.BmvLuxInterior;

public class X7 implements Jeep {
    private Engine engine;
    private CarBody carBody;
    private Interior interior;

    protected X7() {
        engine = new BmwGoodEngine();
        carBody = new BmwJeepBody();
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
