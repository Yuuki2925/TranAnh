import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class AbsoluteNumberCalculatorTest {
    @Test
    @DisplayName ("Testing abs(0)")
    public void testFindAbsolute1() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName ("Testing abs(positive)")
    public void testFindAbsolute2() {
        int number = 1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }


    @Test
    @DisplayName ("Testing abs(negative)")
    public void testFindAbsolute3() {
        int number = -1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
}
