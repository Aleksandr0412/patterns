package com.aleksandr0412.visitor.figures;


import com.aleksandr0412.visitor.visitors.Visitor;

public class Triangle extends Figure {

    /**
     * Base(sm)
     */
    private final double base;

    /**
     * Height(sm)
     */
    private final double height;

    /**
     * Left side(sm)
     */
    private final double left;

    /**
     * Right side(sm)
     */
    private final double right;

    public Triangle(double base, double height, double left, double right) {
        super("Triangle");
        this.base = base;
        this.height = height;
        this.left = left;
        this.right = right;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getLeft() {
        return left;
    }

    public double getRight() {
        return right;
    }
}