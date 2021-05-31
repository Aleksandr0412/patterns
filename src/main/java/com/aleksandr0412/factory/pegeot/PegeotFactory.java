package com.aleksandr0412.factory.pegeot;

import com.aleksandr0412.factory.CarFactory;
import com.aleksandr0412.factory.Economy;
import com.aleksandr0412.factory.Jeep;
import com.aleksandr0412.factory.Lux;

public class PegeotFactory implements CarFactory {
    @Override
    public Jeep createJeep() {
        return new PegeotJeep();
    }

    @Override
    public Lux createLux() {
        return new PegeotLux();
    }

    @Override
    public Economy createEconomy() {
        return new PegeotCheep();
    }
}
