package com.aleksandr0412.factory.bmv;

import com.aleksandr0412.factory.CarFactory;
import com.aleksandr0412.factory.Economy;
import com.aleksandr0412.factory.Jeep;
import com.aleksandr0412.factory.Lux;

public class BmvFactory implements CarFactory {

    @Override
    public Jeep createJeep() {
        return new X7();
    }

    @Override
    public Lux createLux() {
        return new CamryLux();
    }

    @Override
    public Economy createEconomy() {
        return new X1();
    }
}
