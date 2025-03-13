import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTranslateTest {
    @Test
    public void testFizzBuzz01() {
        int number = 3;
        String expected = "Fizz";
        String actualResults = FizzBuzzTranslate.translate(number);
        assertEquals(expected, actualResults);
    }

    @Test
    public void testFizzBuzz02() {
        int number = 5;
        String expected = "Buzz";
        String actualResults = FizzBuzzTranslate.translate(number);
        assertEquals(expected, actualResults);
    }

    @Test
    public void testFizzBuzz03() {
        int number = 6;
        String expected = "Fizz";
        String actualResults = FizzBuzzTranslate.translate(number);
        assertEquals(expected, actualResults);
    }

    @Test
    public void testFizzBuzz06() {
        int number = 10;
        String expected = "Buzz";
        String actualResults = FizzBuzzTranslate.translate(number);
        assertEquals(expected, actualResults);
    }

    @Test
    public void testFizzBuzz07() {
        int number = 15;
        String expected = "FizzBuzz";
        String actualResults = FizzBuzzTranslate.translate(number);
        assertEquals(expected, actualResults);
    }

    @Test
    public void testFizzBuzz08() {
        int number = 30;
        String expected = "FizzBuzz";
        String actualResults = FizzBuzzTranslate.translate(number);
        assertEquals(expected, actualResults);
    }

    @Test
    public void testFizzBuzz09() {
        int number = 13;
        String expected = "Fizz";
        String actualResults = FizzBuzzTranslate.translate(number);
        assertEquals(expected, actualResults);
    }

    @Test
    public void testFizzBuzz10() {
        int number = 52;
        String expected = "Buzz";
        String actualResults = FizzBuzzTranslate.translate(number);
        assertEquals(expected, actualResults);
    }

    @Test
    public void testFizzBuzz11() {
        int number = 35;
        String expected = "FizzBuzz";
        String actualResults = FizzBuzzTranslate.translate(number);
        assertEquals(expected, actualResults);
    }

    @Test
    public void testFizzBuzz12() {
        int number = 53;
        String expected = "FizzBuzz";
        String actualResults = FizzBuzzTranslate.translate(number);
        assertEquals(expected, actualResults);
    }

    @Test
    public void testFizzBuzz13() {
        assertEquals("một", FizzBuzzTranslate.readNumber(1));
        assertEquals("hai", FizzBuzzTranslate.readNumber(2));
        assertEquals("mười ba", FizzBuzzTranslate.readNumber(13));
        assertEquals("hai mươi", FizzBuzzTranslate.readNumber(20));
        assertEquals("hai sáu", FizzBuzzTranslate.readNumber(26));
        assertEquals("năm mươi", FizzBuzzTranslate.readNumber(50));
        assertEquals("chín chín", FizzBuzzTranslate.readNumber(99));
    }
}
