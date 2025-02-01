import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd() {
        assertEquals(2, Calculator.calculate(1, 1, '+'));
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculateSub() {
        assertEquals(1, Calculator.calculate(2, 1, '-'));
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        assertEquals(4, Calculator.calculate(2, 2, '*'));
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
        assertEquals(2, Calculator.calculate(6, 3, '/'));
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.calculate(2, 0, '/'));
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.calculate(2, 2, '='));
    }
}
