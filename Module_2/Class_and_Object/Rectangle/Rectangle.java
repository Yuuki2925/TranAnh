public class Rectangle {
    double width, height;

    // Constructor khong tham so
    public Rectangle() {
    }

    // Constructor co tham so
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String display() {
        return "Rectangle{" + "width = " + width + ", height = " + height + "}";
    }
}
