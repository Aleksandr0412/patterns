package com.aleksandr0412.factory.pegeot.interior;

import com.aleksandr0412.factory.Interior;

public class PegeotLuxInterior implements Interior {
    @Override
    public String getName() {
        return "Pegeot - good Interier";
    }

    @Override
    public String getColor() {
        return "Pegeot - metall color";
    }

    @Override
    public String getMaterial() {
        return "Pegeot - lux material";
    }
}
