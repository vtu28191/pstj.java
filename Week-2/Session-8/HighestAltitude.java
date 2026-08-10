import java.util.*;

public class HighestAltitude {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] gain = new int[n];

        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }

        int currentAltitude = 0;
        int highestAltitude = 0;

        for (int value : gain) {

            currentAltitude += value;

            highestAltitude =
                Math.max(highestAltitude, currentAltitude);
        }

        System.out.println(highestAltitude);

        sc.close();
    }
}
