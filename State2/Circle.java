package State2;

public class Circle extends Shape {
    private int radios;

    public Circle(int radios) {
        this.radios = radios;
    }

    public int getRadios() {
        return radios;
    }

    @Override
    public boolean checkEquals(Object object) {
        if (object.toString().equals(this.toString())) {
            if (object instanceof Circle) {
                return this.radios == ((Circle) object).getRadios();
            }
        }
        return false;
    }
}
