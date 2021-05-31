package com.aleksandr0412.factory.bmv;

import com.aleksandr0412.factory.Engine;
import com.aleksandr0412.factory.CarBody;
import com.aleksandr0412.factory.Economy;
import com.aleksandr0412.factory.Interior;
import com.aleksandr0412.factory.bmv.carbody.BmvCheepBody;
import com.aleksandr0412.factory.bmv.engine.BmvBadEngine;
import com.aleksandr0412.factory.bmv.interior.BmvLuxInterior;

public class X1 implements Economy {
    private Engine engine;
    private CarBody carBody;
    private Interior interior;

    protected X1() {
        engine = new BmvBadEngine();
        carBody = new BmvCheepBody();
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
