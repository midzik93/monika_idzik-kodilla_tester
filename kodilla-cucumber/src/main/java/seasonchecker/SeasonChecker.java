package seasonchecker;

import java.time.MonthDay;

public class SeasonChecker {

    public static String checkIfSummer(MonthDay date) {
        return isDateInSummer(date) ? "Yes! Summer!" : "Nope";
    }

    private static boolean isDateInSummer(MonthDay date) {
        return date.isAfter(MonthDay.of(6, 21)) && date.isBefore(MonthDay.of(9, 24));
    }
}