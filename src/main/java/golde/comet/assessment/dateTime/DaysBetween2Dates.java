package golde.comet.assessment.dateTime;

import java.time.LocalDate;

public class DaysBetween2Dates {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2020, 1, 1);
        LocalDate date2 = LocalDate.now();

        System.out.println("Days between "+date1+" and "+date2+" is "+daysBetween(date2, date1));
    }

    public static long daysBetween(LocalDate date1, LocalDate date2) {

            return Math.abs(date2.until(date1).getDays());

    }


}
