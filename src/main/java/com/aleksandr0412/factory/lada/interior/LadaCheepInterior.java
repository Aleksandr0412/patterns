package com.aleksandr0412.factory.lada.interior;

import com.aleksandr0412.factory.Interior;

public class LadaCheepInterior implements Interior {
    @Override
    public String getName() {
        return "Lada - bad Interier";
    }

    @Override
    public String getColor() {
        return "Lada - Dark color";
    }

    @Override
    public String getMaterial() {
        return "Lada - Bad material";
    }
}
