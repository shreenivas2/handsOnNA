package Assignment2;

import java.awt.Point;

abstract class Shape {
    abstract void draw();
}
class Line extends Shape {
    Point start;
    Point end;
    Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    @Override
    void draw() {
        System.out.println("Drawing a line from " + start + " to " + end);
    }
}
class Rectangle extends Shape {
    int x, y, width, height;
    Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    @Override
    void draw() {
        System.out.println("Drawing a rectangle at " + x + "," + y + " with width " + width + " and height " + height);
    }
}
class Cube extends Shape {
    int x, y, z, side;
    Cube(int x, int y, int z, int side) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.side = side;
    }
    @Override
    void draw() {
        System.out.println("Drawing a cube at " + x + "," + y + "," + z + " with side " + side);
    }
}
public class pgm5 {
    public static void main(String[] args) {
        Line line = new Line(new Point(0, 0), new Point(10, 10));
        line.draw();
        Rectangle rectangle = new Rectangle(0, 0, 100, 50);
        rectangle.draw();
        Cube cube = new Cube(0, 0, 0, 10);
        cube.draw();
    }
}

