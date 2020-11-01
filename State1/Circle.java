package State1;

import java.util.ArrayList;

public class Circle extends Paint {
    private int radios;

    public Circle(int radios) {
        this.radios = radios;
    }

    public int getRadios() {
        return radios;
    }

    public double calculatePerimeter() {
        return (Math.PI * 2 * radios);
    }

    public double calculateArea() {
        return (Math.PI * radios * radios);
    }

    public void draw() {
        System.out.println("Circle\n" +
                "Its sides: " + radios);
    }

    public boolean equals(String shape, int radios) {
        if (shape.equals("Circle")) {
            return this.radios == radios;
        }
        return false;
    }

    public void convertToString() {
        System.out.println("Circle\n" +
                "Radios: " + radios +
                "\nPerimeter: " + calculatePerimeter() +
                "\nArea: " + calculateArea());
    }
}
