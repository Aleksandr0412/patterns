package com.aleksandr0412.factory.bmv.interior;

import com.aleksandr0412.factory.Interior;

public class BmwCheepInterior implements Interior {
    @Override
    public String getName() {
        return "Bmw - bad Interier";
    }

    @Override
    public String getColor() {
        return "Bmw - Dark color";
    }

    @Override
    public String getMaterial() {
        return "Bmw - Bad material";
    }
}
