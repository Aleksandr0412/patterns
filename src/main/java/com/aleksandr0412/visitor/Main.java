package com.aleksandr0412.visitor;

import com.aleksandr0412.visitor.figures.Circle;
import com.aleksandr0412.visitor.figures.Figure;
import com.aleksandr0412.visitor.figures.Rectangle;
import com.aleksandr0412.visitor.figures.Triangle;
import com.aleksandr0412.visitor.visitors.AreaVisitor;
import com.aleksandr0412.visitor.visitors.DeleteVisitor;
import com.aleksandr0412.visitor.visitors.DrawVisitor;
import com.aleksandr0412.visitor.visitors.PerimeterVisitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figures = List.of(
                new Triangle(9, 4, 3, 6),
                new Circle(2),
                new Rectangle(100, 200)
        );

        figures.forEach(figure -> figure.accept(new AreaVisitor()));
        System.out.println();
        figures.forEach(figure -> figure.accept(new DrawVisitor(5, 5)));
        System.out.println();
        figures.forEach(figure -> figure.accept(new PerimeterVisitor()));
        System.out.println();
        figures.forEach(figure -> figure.accept(new DeleteVisitor()));
    }

}
