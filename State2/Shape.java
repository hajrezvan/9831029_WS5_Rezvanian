package State2;

public class Shape extends Paint {

    public double calculateArea(Object object) {
        double s = 0;
        if (object instanceof Circle) {
            s = (Math.PI * ((Circle) object).getRadios() * ((Circle) object).getRadios());
        } else if (object instanceof Rectangle) {
            if (!((Rectangle) object).getSides().get(0).equals(((Rectangle) object).getSides().get(1))) {
                s = (((Rectangle) object).getSides().get(0) * ((Rectangle) object).getSides().get(1));
            } else if (!((Rectangle) object).getSides().get(2).equals(((Rectangle) object).getSides().get(0))) {
                s = (((Rectangle) object).getSides().get(0) * ((Rectangle) object).getSides().get(2));
            } else {
                s = (((Rectangle) object).getSides().get(0) * ((Rectangle) object).getSides().get(3));
            }
        } else if (object instanceof Triangle) {
            int p = (((Triangle) object).getSides().get(0) + ((Triangle) object).getSides().get(1) + ((Triangle) object).getSides().get(2)) / 2;
            s = Math.sqrt((p * (p - ((Triangle) object).getSides().get(0)) * (p - ((Triangle) object).getSides().get(1)) * (p - ((Triangle) object).getSides().get(2))));
        }
        return s;
    }

    public double calculatePerimeter(Object object) {
        double perimeter = 0;
        if (object instanceof Circle) {
            perimeter = (Math.PI * 2 * ((Circle) object).getRadios());
        } else if (object instanceof Rectangle) {
            for (int r : ((Rectangle) object).getSides()) {
                perimeter += r;
            }
        } else if (object instanceof Triangle) {
            for (int r : ((Triangle) object).getSides()) {
                perimeter += r;
            }
        }
        return perimeter;
    }

    public void draw(Object object) {
        if (object instanceof Circle) {
            System.out.println("Circle\n" +
                    "Its sides: " + ((Circle) object).getRadios());
        } else if (object instanceof Rectangle) {
            System.out.println("Rectangle\n" +
                    "Its sides: " + ((Rectangle) object).getSides());
        } else if (object instanceof Triangle) {
            System.out.println("Triangle\n" +
                    "Its sides: " + ((Triangle) object).getSides());
        }
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
                    "\nThis perimeter: " + calculatePerimeter(object) +
                    "\nThis Area: " + calculateArea(object));
        } else if (object instanceof Triangle) {
            System.out.println("Triangle:\n" +
                    "This sides: " + ((Triangle) object).getSides().toString() +
                    "\nThis perimeter: " + calculatePerimeter(object) +
                    "\nThis Area: " + calculateArea(object));
        } else if (object instanceof Circle) {
            System.out.println("Circle\n" +
                    "Radios: " + ((Circle) object).getRadios() +
                    "\nPerimeter: " + calculatePerimeter(object) +
                    "\nArea: " + calculateArea(object));
        }
    }
}
