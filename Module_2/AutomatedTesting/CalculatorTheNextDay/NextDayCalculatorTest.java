import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {
    @Test
    public void testGetNextDay1() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2/1/2018";
        String actualResults = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actualResults);
    }

    @Test
    public void testGetNextDay2() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1/2/2018";
        String actualResults = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actualResults);
    }

    @Test
    public void testGetNextDay3() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "1/5/2018";
        String actualResults = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actualResults);
    }

    @Test
    public void testGetNextDay4() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "1/3/2018";
        String actualResults = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actualResults);
    }

    @Test
    public void testGetNextDay5() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1/3/2020";
        String actualResults = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actualResults);
    }

    @Test
    public void testGetNextDay6() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "1/1/2019";
        String actualResults = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actualResults);
    }

    @Test
    public void testGetNextDay7() {
        int day = 33;
        int month = 1;
        int year = 2018;
        String expected = "3/2/2018";
        String actualResults = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actualResults);
    }
}
