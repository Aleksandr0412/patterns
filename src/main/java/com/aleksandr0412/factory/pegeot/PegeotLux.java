package com.aleksandr0412.factory.pegeot;

import com.aleksandr0412.factory.Engine;
import com.aleksandr0412.factory.CarBody;
import com.aleksandr0412.factory.Interior;
import com.aleksandr0412.factory.Lux;
import com.aleksandr0412.factory.pegeot.carbody.PegeotLuxBody;
import com.aleksandr0412.factory.pegeot.engine.PegeotGoodEngine;
import com.aleksandr0412.factory.pegeot.interior.PegeotLuxInterior;

public class PegeotLux implements Lux {
    private Engine engine;
    private CarBody carBody;
    private Interior interior;

    protected PegeotLux() {
        engine = new PegeotGoodEngine();
        carBody = new PegeotLuxBody();
        interior = new PegeotLuxInterior();
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
