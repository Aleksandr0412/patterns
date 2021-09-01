package com.aleksandr0412.visitor.visitors;

import com.aleksandr0412.visitor.figures.Triangle;
import com.aleksandr0412.visitor.figures.Circle;
import com.aleksandr0412.visitor.figures.Rectangle;

public abstract class Visitor {

    private final String operationName;

    public Visitor(String operationName) {
        this.operationName = operationName;
    }

    public abstract void visit(Rectangle figure);

    public abstract void visit(Circle figure);

    public abstract void visit(Triangle figure);

    public String getOperationName() {
        return operationName;
    }
}
