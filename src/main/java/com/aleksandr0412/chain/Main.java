package com.aleksandr0412.chain;

import com.aleksandr0412.chain.banknote.CurrencyType;

public class Main {

    public static void main(String[] args) {
        var bancomat = new Atm();

        System.out.println(bancomat.getCash(CurrencyType.RUB, 8999));
        System.out.println(bancomat.getCash(CurrencyType.RUB, 10));
        System.out.println(bancomat.getCash(CurrencyType.RUB, 8999));
        System.out.println(bancomat.getCash(CurrencyType.USD, 550));
        System.out.println(bancomat.getCash(CurrencyType.USD, 10));
        System.out.println(bancomat.getCash(CurrencyType.RUB, 5483));
        System.out.println(bancomat.getCash(CurrencyType.USD, 544));
        System.out.println(bancomat.getCash(CurrencyType.USD, 867870));
        System.out.println(bancomat.getCash(CurrencyType.USD, 33));
        System.out.println(bancomat.getCash(CurrencyType.USD, 98));
    }
}
