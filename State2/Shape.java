package State2;

public class Shape extends Paint {

    public double calculateArea() {
        return 0;
    }

    public double calculatePerimeter() {
        return 0;
    }

    public void draw() {

    }

    public boolean checkEquals(Object object) {
        if (object instanceof Circle) {
            return object.toString().equals(this.toString());
        } else if (object instanceof Rectangle) {
            return object.toString().equals(this.toString());
        } else if (object instanceof Triangle) {
            return object.toString().equals(this.toString());
        }
        return false;
    }

    public void convertToString(Object object) {
        if (object instanceof Rectangle) {
            System.out.println("Rectangle:\n" +
                    "This sides: " + ((Rectangle) object).getSides().toString() +
                    "\nThis perimeter: " + calculatePerimeter() +
                    "\nThis Area: " + calculateArea());
        } else if (object instanceof Triangle) {
            System.out.println("Triangle:\n" +
                    "This sides: " + ((Triangle) object).getSides().toString() +
                    "\nThis perimeter: " + calculatePerimeter() +
                    "\nThis Area: " + calculateArea());
        } else if (object instanceof Circle) {
            System.out.println("Circle\n" +
                    "Radios: " + ((Circle) object).getRadios() +
                    "\nPerimeter: " + calculatePerimeter() +
                    "\nArea: " + calculateArea());
        }
    }
}
