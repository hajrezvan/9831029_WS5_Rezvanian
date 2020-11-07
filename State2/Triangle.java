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
    public boolean checkEquals(Object object) {
        if (object.toString().equals(this.toString())) {
            if (object instanceof Triangle) {
                return this.sides == ((Triangle) object).getSides();
            }
        }
        return false;
    }
}
