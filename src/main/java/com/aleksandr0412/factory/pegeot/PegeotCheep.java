package com.aleksandr0412.factory.pegeot;

import com.aleksandr0412.factory.Engine;
import com.aleksandr0412.factory.CarBody;
import com.aleksandr0412.factory.Economy;
import com.aleksandr0412.factory.Interior;
import com.aleksandr0412.factory.pegeot.carbody.PegeotCheepBody;
import com.aleksandr0412.factory.pegeot.engine.PegeotBadEngine;
import com.aleksandr0412.factory.pegeot.interior.PegeotCheepInterior;

public class PegeotCheep implements Economy {
    private Engine engine;
    private CarBody carBody;
    private Interior interior;

    protected PegeotCheep() {
        engine = new PegeotBadEngine();
        carBody = new PegeotCheepBody();
        interior = new PegeotCheepInterior();
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
