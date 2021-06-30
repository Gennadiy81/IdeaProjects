package JavaClasses.day57_abstraction_polimorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();
        Shape circle = new Circle();
        circle.draw();
        Shape square = new Square();
        square.draw();
        /**
         * single variable of parent type, and different objects of child types
         */
        Shape shape = new Triangle();
        shape.draw();
        shape = new Circle();
        shape.draw();
        shape = new Square();
        shape.draw();

        /**
         * create list of Shapes and store 10 different shapes
         * using a loop print out each shape
         */
        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Circle());

        //System.out.println(shapes); prints Hashcodes of objects
        for (Shape eachShape : shapes) {
            eachShape.draw();
        }

        drawShape(new Circle());
        drawShape(new Square());
        drawShape(triangle);

    }
    public static void drawShape(Shape shape) {
        System.out.println("----Drawing shape----");
        shape.draw();
    }


}
