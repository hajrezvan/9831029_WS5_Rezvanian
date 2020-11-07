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
    public double calculatePerimeter() {
        return (Math.PI * 2 * radios);
    }

    @Override
    public double calculateArea() {
        return (Math.PI * radios * radios);
    }

    @Override
    public void draw() {
        System.out.println("Circle\n" +
                "Its sides: " + radios);
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
