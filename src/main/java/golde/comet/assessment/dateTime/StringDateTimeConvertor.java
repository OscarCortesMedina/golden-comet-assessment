package golde.comet.assessment.dateTime;


import java.time.LocalDate;

public class StringDateTimeConvertor {
    public static void main(String[] args) {
        String date = "2020-01-01";
        System.out.println(convertStrToDate(date));
        System.out.println(convertDateToStr(LocalDate.now()));
    }

    private static String convertDateToStr(LocalDate now) {
        return now.toString();
    }

    public static LocalDate convertStrToDate(String date) {
        return LocalDate.parse(date);
    }
}
