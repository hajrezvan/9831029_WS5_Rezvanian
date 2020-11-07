package State2;

import java.util.ArrayList;

public class Paint {
    private ArrayList<Shape> shapes;

    public Paint() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void drawAll() {
        for (Shape s :
                shapes) {
            s.draw();
        }
    }

    public void printAll() {
        for (Shape s :
                shapes) {
            s.convertToString(this);
            System.out.println();
        }
    }
}
