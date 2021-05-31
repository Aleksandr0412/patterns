package com.aleksandr0412.factory.pegeot.interior;

import com.aleksandr0412.factory.Interior;

public class PegeotCheepInterior implements Interior {
    @Override
    public String getName() {
        return "Pegeot - bad Interier";
    }

    @Override
    public String getColor() {
        return "Pegeot - Dark color";
    }

    @Override
    public String getMaterial() {
        return "Pegeot - Bad material";
    }
}
