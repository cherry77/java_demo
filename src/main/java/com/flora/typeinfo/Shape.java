package com.flora.typeinfo;

import java.util.Arrays;
import java.util.List;

/**
 * @author Flora on 2021/1/16.
 */
abstract public class Shape {
    void draw(){
        System.out.println(this + ".draw();");
    }
    abstract public String toString();
}

class Circle extends Shape{
    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape{
    @Override
    public String toString() {
        return "Square";
    }
}

class Rhomboid extends Shape{
    @Override
    public String toString() {
        return "Rhomboid";
    }
}

class Shapes{
    public static void main(String[] args) throws ClassNotFoundException {
        // upcasting to Shape:
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square());
        // downcasting back to specific shape:
        for(Shape shape : shapeList){
            shape.draw();
        }
        Rhomboid r = new Rhomboid();
        // Upcast:
        Shape s = (Shape)r;
        s.draw();
        // check type before downcast:
        if(s instanceof Circle){
            ((Circle)s).draw();
        }else{
            System.out.println("(Shape)r is not a Circle");
        }

        for(Shape shape : shapeList){
            rotate(shape);
        }
    }

    public static void rotate(Shape s){
        if(!(s instanceof Circle)) {
            System.out.println(s + " rotate");
        }
    }
}
