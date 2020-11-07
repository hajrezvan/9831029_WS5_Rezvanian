package State2;

import java.util.ArrayList;

public class Triangle extends Polygon {

    public Triangle(int side1, int side2, int side3) {
        sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 0;
        for (int r : sides) {
            perimeter += r;
        }
        return perimeter;
    }

    @Override
    public double calculateArea() {
        int s = (sides.get(0) + sides.get(1) + sides.get(2)) / 2;
        return Math.sqrt((s * (s - sides.get(0)) * (s - sides.get(1)) * (s - sides.get(2))));
    }

    @Override
    public void draw() {
        System.out.println("Triangle\n" +
                "Its sides: " + sides);
    }

    @Override
    public boolean checkEquals(Object object) {
        if (object.toString().equals(this.toString())) {
            if (object instanceof Triangle) {
                return this.sides == ((Triangle) object).getSides();
            }
        }
        return false;
    }
}
