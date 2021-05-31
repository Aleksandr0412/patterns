package com.aleksandr0412.factory.bmv.interior;

import com.aleksandr0412.factory.Interior;

public class BmvLuxInterior implements Interior {
    @Override
    public String getName() {
        return "Bmw - good Interier";
    }

    @Override
    public String getColor() {
        return "Bmw - metall color";
    }

    @Override
    public String getMaterial() {
        return "Bmw - lux material";
    }
}
