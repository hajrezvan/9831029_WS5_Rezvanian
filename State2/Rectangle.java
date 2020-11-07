package State2;

import java.util.ArrayList;

public class Rectangle extends Polygon {

    public Rectangle(int side1, int side2, int side3, int side4) {
        sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
        sides.add(side4);
    }

    @Override
    public boolean checkEquals(Object object) {
        if (object.toString().equals(this.toString())) {
            if (object instanceof Rectangle) {
                return this.sides == ((Rectangle) object).getSides();
            }
        }
        return false;
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
