package golde.comet.assessment.dateTime;

import java.time.LocalDate;

public class DateTimeSubtractor {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(subtractTime(1, 1, 1, date).toString());


    }

    public static LocalDate subtractTime(int addDays, int minusMonths, int minusYears, LocalDate date) {
        return date.plusDays(addDays).minusMonths(minusMonths).minusYears(minusYears);
    }
}
