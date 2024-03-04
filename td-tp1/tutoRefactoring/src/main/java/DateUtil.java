import java.time.LocalDate;

public class DateUtil {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        return isDateBetween(LocalDate.now(), startingDate, endingDate, true);
    }

    public static boolean isDateBetween(LocalDate date, LocalDate startingDate, LocalDate endingDate, boolean inclusive) {
        // Code à modifier pour tenir compte du paramètre "inclusive"
        return (date.isAfter(startingDate)
                &&
                date.isBefore(endingDate)
        );
    }

    public static boolean isDateOutside(LocalDate date, LocalDate startingDate, LocalDate endingDate){
        return !isDateBetween(date, startingDate, endingDate, true);
    }
}