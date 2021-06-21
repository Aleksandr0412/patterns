package com.aleksandr0412.factory;

import com.aleksandr0412.factory.Economy;
import com.aleksandr0412.factory.Jeep;
import com.aleksandr0412.factory.Lux;
import com.aleksandr0412.factory.bmv.BmvFactory;
import com.aleksandr0412.factory.lada.LadaFactory;
import com.aleksandr0412.factory.pegeot.PegeotFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Lux x1 = new BmvFactory().createLux();
        System.out.println(x1.getCarBody().getName());
        Lux vesta = new LadaFactory().createLux();
        System.out.println(vesta.getEngine().getFuel());
        Lux pegeot = new PegeotFactory().createLux();

        Jeep niva = new LadaFactory().createJeep();


        Economy pegeotCheep = new PegeotFactory().createEconomy();
    }
}