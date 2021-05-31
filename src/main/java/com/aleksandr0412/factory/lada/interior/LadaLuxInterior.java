package com.aleksandr0412.factory.lada.interior;

import com.aleksandr0412.factory.Interior;

public class LadaLuxInterior implements Interior {
    @Override
    public String getName() {
        return "Lada - good Interier";
    }

    @Override
    public String getColor() {
        return "Lada - metall color";
    }

    @Override
    public String getMaterial() {
        return "Lada - lux material";
    }
}
