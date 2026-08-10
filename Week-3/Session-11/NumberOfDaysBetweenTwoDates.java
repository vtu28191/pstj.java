import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NumberOfDaysBetweenTwoDates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String date1 = sc.next();
        String date2 = sc.next();

        LocalDate firstDate = LocalDate.parse(date1);
        LocalDate secondDate = LocalDate.parse(date2);

        long days = Math.abs(
            ChronoUnit.DAYS.between(firstDate, secondDate)
        );

        System.out.println(days);

        sc.close();
    }
}
