public class NextDayCalculator {
    public static String getNextDay(int day, int month, int year) {
        int dayInMonth = dayInMonth(month, year);
        if (day < dayInMonth) {
            return (day + 1) + "/" + month + "/" + year;
        } else if (day > dayInMonth) {
            return (day - dayInMonth + 1) + "/" + (month + 1) + "/" + year;
        } else if (month == 12) {
            return "1/1/" + (year + 1);
        } else {
            return "1/" + (month + 1) + "/" + year;
        }
    }

    public static boolean checkLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static int dayInMonth(int month, int year) {
        switch (month) {
            case Month.JANUARY:
            case Month.MARCH:
            case Month.MAY:
            case Month.JULY:
            case Month.AUGUST:
            case Month.OCTOBER:
            case Month.DECEMBER:
                return 31;
            case Month.APRIL:
            case Month.JUNE:
            case Month.SEPTEMBER:
            case Month.NOVEMBER:
                return 30;
            case Month.FEBRUARY:
                if (checkLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }
}
