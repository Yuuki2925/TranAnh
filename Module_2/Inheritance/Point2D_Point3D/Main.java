public class Main {
    public static void main(String[] args) {
        // Kiểm thử lớp Point2D
        Point2D point2D = new Point2D(3.5f, 5.5f);
        System.out.println("Point2D: " + point2D);

        // Kiểm thử lớp Point3D
        Point3D point3D = new Point3D(3.5f, 5.5f, 7.5f);
        System.out.println("Point3D: " + point3D);

        // Thay đổi giá trị và in lại
        point3D.setXYZ(1.0f, 2.0f, 3.0f);
        System.out.println("Updated Point3D: " + point3D);
    }
}
