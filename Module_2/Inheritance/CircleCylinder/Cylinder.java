public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height, String color, double radius) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[radius = " + getRadius()
                + ", color = " + getColor()
                + ", height = " + height
                + ", volume = " + getVolume() + "]";
    }
}
