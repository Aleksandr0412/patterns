package com.aleksandr0412.visitor.visitors;

import com.aleksandr0412.visitor.figures.Circle;
import com.aleksandr0412.visitor.figures.Rectangle;
import com.aleksandr0412.visitor.figures.Triangle;

public class DeleteVisitor extends Visitor {
    public DeleteVisitor() {
        super("Delete ");
    }

    @Override
    public void visit(Rectangle figure) {
        System.out.println(getOperationName() + figure.getName());
    }

    @Override
    public void visit(Circle figure) {
        System.out.println(getOperationName() + figure.getName());
    }

    @Override
    public void visit(Triangle figure) {
        System.out.println(getOperationName() + figure.getName());
    }
}
