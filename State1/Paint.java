package State1;

import java.util.ArrayList;

public class Paint {
    private ArrayList<Rectangle> rectangle;
    private ArrayList<Triangle> triangle;
    private ArrayList<Circle> circle;

    public Paint() {
        rectangle = new ArrayList<>();
        triangle = new ArrayList<>();
        circle = new ArrayList<>();
    }

    public void addRectangle(Rectangle rectangle) {
        this.rectangle.add(rectangle);
    }

    public void addTriangle(Triangle triangle) {
        this.triangle.add(triangle);
    }

    public void addCircle(Circle circle) {
        this.circle.add(circle);
    }

    public void drawAll() {
        for (Rectangle r : rectangle) {
            r.draw();
            System.out.println();
        }
        for (Triangle r : triangle) {
            r.draw();
            System.out.println();
        }
        for (Circle r : circle) {
            r.draw();
            System.out.println();
        }
    }

    public void printAll() {

    }
}
