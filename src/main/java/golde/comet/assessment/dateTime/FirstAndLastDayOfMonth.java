package golde.comet.assessment.dateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class FirstAndLastDayOfMonth {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        // Find the first day of the month
        LocalDate firstDayOfMonth = currentDate.with(TemporalAdjusters.firstDayOfMonth());
        DayOfWeek firstDayOfWeek = firstDayOfMonth.getDayOfWeek();

        // Find the last day of the month
        LocalDate lastDayOfMonth = currentDate.with(TemporalAdjusters.lastDayOfMonth());
        DayOfWeek lastDayOfWeek = lastDayOfMonth.getDayOfWeek();

        // Format the output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE");

        System.out.println("First day of this month: " + formatter.format(firstDayOfWeek));
        System.out.println("Last day of this month: " + formatter.format(lastDayOfWeek));
    }

}
