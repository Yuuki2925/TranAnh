public class TriangleClassifier {
    public static String checkTriangle(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                return "Tam giác đều";
            } else if (a == b || a == c || b == c) {
                return "Tam giác cân";
            } else {
                return "Tam giác thường";
            }
        } else {
            return "Không phải là tam giác";
        }
    }
}
