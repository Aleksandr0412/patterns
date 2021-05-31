package com.aleksandr0412.factory.lada;

import com.aleksandr0412.factory.CarFactory;
import com.aleksandr0412.factory.Economy;
import com.aleksandr0412.factory.Jeep;
import com.aleksandr0412.factory.Lux;

public class LadaFactory implements CarFactory {
    @Override
    public Jeep createJeep() {
        return new Niva();
    }

    @Override
    public Lux createLux() {
        return new Vesta();
    }

    @Override
    public Economy createEconomy() {
        return new Granta();
    }
}
