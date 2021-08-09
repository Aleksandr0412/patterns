package com.aleksandr0412.visitor.figures;

import com.aleksandr0412.visitor.visitors.Visitor;

public abstract class Figure {

    private final String name;

    public Figure(String name) {
        this.name = name;
    }

    public abstract void accept(Visitor visitor);

    public String getName() {
        return name;
    }

}