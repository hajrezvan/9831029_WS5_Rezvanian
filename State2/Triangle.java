package State2;

import java.util.ArrayList;

public class Triangle extends Polygon {

    public Triangle(int side1, int side2, int side3) {
        sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        for (int r : sides) {
            perimeter += r;
        }
        return perimeter;
    }

    public double calculateArea() {
        int s = (sides.get(0) + sides.get(1) + sides.get(2)) / 2;
        return Math.sqrt((s * (s - sides.get(0)) * (s - sides.get(1)) * (s - sides.get(2))));
    }

    public void draw() {
        System.out.println("Triangle\n" +
                "Its sides: " + sides);
    }

    public boolean equals(String shape, ArrayList<Integer> sides) {
        if (shape.equals("Triangle")) {
            return this.sides == sides;
        }
        return false;
    }

    public void convertToString() {
        System.out.println("Triangle:\n" +
                "This sides: " + sides.toString() +
                "\nThis perimeter: " + calculatePerimeter() +
                "\nThis Area: " + calculateArea());
    }
}
