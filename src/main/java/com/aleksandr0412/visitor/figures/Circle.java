package com.aleksandr0412.visitor.figures;


import com.aleksandr0412.visitor.visitors.Visitor;

public class Circle extends Figure {

    /**
     * Radius(sm)
     */
    private final double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getRadius() {
        return radius;
    }

}