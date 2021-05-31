package com.aleksandr0412.factory.lada;

import com.aleksandr0412.factory.Engine;
import com.aleksandr0412.factory.CarBody;
import com.aleksandr0412.factory.Interior;
import com.aleksandr0412.factory.Lux;
import com.aleksandr0412.factory.lada.carbody.LadaLuxBody;
import com.aleksandr0412.factory.lada.engine.LadaGoodEngine;
import com.aleksandr0412.factory.lada.interior.LadaLuxInterior;

public class Vesta implements Lux {
    private Engine engine;
    private CarBody carBody;
    private Interior interior;

    protected Vesta() {
        engine = new LadaGoodEngine();
        carBody = new LadaLuxBody();
        interior = new LadaLuxInterior();
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
