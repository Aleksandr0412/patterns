package com.aleksandr0412.visitor.visitors;

import static java.lang.Math.PI;

import com.aleksandr0412.visitor.figures.Circle;
import com.aleksandr0412.visitor.figures.Rectangle;
import com.aleksandr0412.visitor.figures.Triangle;

public class PerimeterVisitor extends Visitor {

    public PerimeterVisitor() {
        super("Perimeter of figure");
    }

    @Override
    public void visit(Rectangle figure) {
        double perimeter = 2 * (figure.getHeight() + figure.getLength());
        System.out.printf("Perimeter of rectangle is %f sm\n", perimeter);
    }

    @Override
    public void visit(Circle figure) {
        double perimeter = 2 * PI * figure.getRadius();
        System.out.printf("Perimeter of circle is %f sm\n", perimeter);
    }

    @Override
    public void visit(Triangle figure) {
        double perimeter = figure.getLeft() + figure.getRight() + figure.getBase();
        System.out.printf("Perimeter of triangle is %f sm\n", perimeter);
    }

}
