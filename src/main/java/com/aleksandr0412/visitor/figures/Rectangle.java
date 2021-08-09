package com.aleksandr0412.visitor.figures;


import com.aleksandr0412.visitor.visitors.Visitor;

public class Rectangle extends Figure {

    /**
     * Length(sm)
     */
    private final double length;

    /**
     * Height(sm)
     */
    private final double height;

    public Rectangle(double length, double height) {
        super("Rectangle");
        this.length = length;
        this.height = height;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

}