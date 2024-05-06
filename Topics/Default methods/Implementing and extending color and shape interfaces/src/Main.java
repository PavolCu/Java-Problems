// Both interfaces 'Shape' and 'Colorable' need to be declared here
// Remember to add the default methods 'name()' and 'color()'


// Implement the interfaces in the 'Circle' class here
// Make sure to override the 'name()' method


// Create the 'ColoredCircle' class that extends 'Circle' and overrides 'color()'


interface Shape {
    default String name() {
        return "Generic Shape";
    }
}

interface Colorable {
    default String color() {
        return "No Color";
    }
}

class Circle implements Shape, Colorable {
    @Override
    public String name() {
        return "Circle";
    }
}

class ColoredCircle extends Circle {
    @Override
    public String color() {
        return "Red";
    }
}

public class Main {

    public static String getShapeDetails(String shapeType) {
        if ("Circle".equals(shapeType)) {
            Circle circle = new Circle();
            return circle.name() + "\n" + circle.color();
        } else if ("ColoredCircle".equals(shapeType)) {
            ColoredCircle coloredCircle = new ColoredCircle();
            return coloredCircle.name() + "\n" + coloredCircle.color();
        } else {
            return "Invalid shape type";
        }
    }

    public static void main(String[] args) {
        System.out.println(getShapeDetails()); // Edited this line

    }
}