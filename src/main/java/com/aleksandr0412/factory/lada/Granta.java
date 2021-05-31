package com.aleksandr0412.factory.lada;

import com.aleksandr0412.factory.Engine;
import com.aleksandr0412.factory.CarBody;
import com.aleksandr0412.factory.Economy;
import com.aleksandr0412.factory.Interior;
import com.aleksandr0412.factory.lada.carbody.LadaCheepBody;
import com.aleksandr0412.factory.lada.engine.LadaBadEngine;
import com.aleksandr0412.factory.lada.interior.LadaCheepInterior;

public class Granta implements Economy {
    private Engine engine;
    private CarBody carBody;
    private Interior interior;

    protected Granta() {
        engine = new LadaBadEngine();
        carBody = new LadaCheepBody();
        interior = new LadaCheepInterior();
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
