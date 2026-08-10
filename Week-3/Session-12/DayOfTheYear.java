import java.time.LocalDate;
import java.util.Scanner;

public class DayOfTheYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String date = sc.next();

        LocalDate currentDate =
            LocalDate.parse(date);

        System.out.println(
            currentDate.getDayOfYear()
        );

        sc.close();
    }
}
