package State1;

import java.util.ArrayList;

public class Rectangle extends Paint {
    private ArrayList<Integer> sides;

    public Rectangle(int side1, int side2, int side3, int side4) {
        sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
        sides.add(side4);
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
        if (!sides.get(0).equals(sides.get(1))) {
            return (sides.get(0) * sides.get(1));
        } else if (!sides.get(2).equals(sides.get(0))) {
            return (sides.get(0) * sides.get(2));
        } else {
            return (sides.get(0) * sides.get(3));
        }
    }

    public void draw() {
        System.out.println("Rectangle\n" +
                "Its sides: " + sides);
    }

    public boolean equals(String shape, ArrayList<Integer> sides) {
        if (shape.equals("Rectangle")) {
            return this.sides == sides;
        }
        return false;
    }

    public void convertToString() {
        System.out.println("Rectangle:\n" +
                "This sides: " + sides.toString() +
                "\nThis perimeter: " + calculatePerimeter() +
                "\nThis Area: " + calculateArea());
    }

    public boolean isSquare() {
        for (int i = 0; i < 3; i++) {
            if (!sides.get(i).equals(sides.get(i + 1))) {
                return false;
            }
        }
        return true;
    }
}
