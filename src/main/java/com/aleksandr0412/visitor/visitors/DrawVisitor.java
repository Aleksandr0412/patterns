package com.aleksandr0412.visitor.visitors;

import com.aleksandr0412.visitor.figures.Circle;
import com.aleksandr0412.visitor.figures.Rectangle;
import com.aleksandr0412.visitor.figures.Triangle;

public class DrawVisitor extends Visitor {

    /**
     * X-axis
     */
    private final int x;

    /**
     * Y-axis
     */
    private final int y;

    public DrawVisitor(int x, int y) {
        super("Draw ");
        this.x = x;
        this.y = y;
    }

    @Override
    public void visit(Rectangle figure) {
        System.out.printf("%s%s from coordinates (%s %s) with length  %f sm and height %f sm\n", getOperationName(),
                figure.getName(), x, y, figure.getLength(), figure.getHeight());
    }

    @Override
    public void visit(Circle figure) {
        System.out.printf("%s%s from coordinates of center (%s %s) with radius %.1f sm\n", getOperationName(),
                figure.getName(), x, y, figure.getRadius());
    }

    @Override
    public void visit(Triangle figure) {
        System.out.printf("%s%s from coordinates (%s %s) with base %.1fsm and left side %f sm and right side" +
                        "%f sm\n", getOperationName(), figure.getName(), x, y, figure.getBase(), figure.getLeft(),
                figure.getRight());
    }

}