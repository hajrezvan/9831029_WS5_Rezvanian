package State2;

public class MainState2 {
    public static void main(String[] args) {
        Shape circle1 = new Circle(19);
        Shape circle2 = new Circle(3);
        Polygon rect1 = new Triangle(1, 4, 1);
        Polygon rect2 = new Rectangle(8, 5, 8, 5);
        Shape rec3 = new Rectangle(6, 6, 6, 6);
        Polygon tri1 = new Triangle(2, 2, 2);
        Triangle tri2 = new Triangle(4, 4, 6);
        Shape tri3 = new Triangle(2, 2, 2);
        circle1 = circle2;
        rect2 = (Polygon) rec3;
        tri1 = (Polygon) tri3;
        circle2 = tri3;
        tri3 = tri2;
        Shape rect3 = new Triangle(2, 3, 2);

        Paint shape = new Paint();
        shape.addShape(circle1);
        shape.addShape(circle2);
        shape.addShape(rect1);
        shape.addShape(rect2);
        shape.addShape(rec3);
        shape.addShape(tri1);
        shape.addShape(tri2);
        shape.addShape(tri3);
        shape.addShape(rect3);

        Paint paint = new Paint();
        paint.drawAll();
        paint.printAll();
    }
}
