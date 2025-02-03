import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {
    @Test
    @DisplayName("Tam giác đều")
    public void testTriangle01() {
        int sideOne = 2;
        int sideTwo = 2;
        int sideThree = 2;
        String expected = "Tam giác đều";
        String actualResults = TriangleClassifier.checkTriangle(sideOne, sideTwo, sideThree);
        assertEquals(expected, actualResults);
    }

    @Test
    @DisplayName("Tam giác cân")
    public void testTriangle02() {
        int sideOne = 2;
        int sideTwo = 2;
        int sideThree = 3;
        String expected = "Tam giác cân";
        String actualResults = TriangleClassifier.checkTriangle(sideOne, sideTwo, sideThree);
        assertEquals(expected, actualResults);
    }

    @Test
    @DisplayName("Tam giác thường")
    public void testTriangle03() {
        int sideOne = 3;
        int sideTwo = 4;
        int sideThree = 5;
        String expected = "Tam giác thường";
        String actualResults = TriangleClassifier.checkTriangle(sideOne, sideTwo, sideThree);
        assertEquals(expected, actualResults);
    }

    @Test
    @DisplayName("Không phải là tam giác")
    public void testTriangle04() {
        int sideOne = 8;
        int sideTwo = 2;
        int sideThree = 3;
        String expected = "Không phải là tam giác";
        String actualResults = TriangleClassifier.checkTriangle(sideOne, sideTwo, sideThree);
        assertEquals(expected, actualResults);
    }

    @Test
    @DisplayName("Không phải là tam giác")
    public void testTriangle05() {
        int sideOne = -1;
        int sideTwo = 2;
        int sideThree = 1;
        String expected = "Không phải là tam giác";
        String actualResults = TriangleClassifier.checkTriangle(sideOne, sideTwo, sideThree);
        assertEquals(expected, actualResults);
    }

    @Test
    @DisplayName("Không phải là tam giác")
    public void testTriangle06() {
        int sideOne = 0;
        int sideTwo = 1;
        int sideThree = 1;
        String expected = "Không phải là tam giác";
        String actualResults = TriangleClassifier.checkTriangle(sideOne, sideTwo, sideThree);
        assertEquals(expected, actualResults);
    }
}
