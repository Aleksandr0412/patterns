package com.aleksandr0412.visitor.visitors;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

import com.aleksandr0412.visitor.figures.Circle;
import com.aleksandr0412.visitor.figures.Rectangle;
import com.aleksandr0412.visitor.figures.Triangle;

public class AreaVisitor extends Visitor {

    public AreaVisitor() {
        super("Area of ");
    }

    @Override
    public void visit(Rectangle figure) {
        double area = figure.getHeight() * figure.getLength();
        System.out.printf("%s%s: %f sm2\n", getOperationName(), figure.getName(), area);
    }

    @Override
    public void visit(Circle figure) {
        double area = PI * pow(figure.getRadius(), 2);
        System.out.printf("%s%s: %f sm2\n", getOperationName(), figure.getName(), area);
    }

    @Override
    public void visit(Triangle figure) {
        double area = 0.5 * figure.getBase() * figure.getHeight();
        System.out.printf("%s%s: %f sm2\n", getOperationName(), figure.getName(), area);
    }

}