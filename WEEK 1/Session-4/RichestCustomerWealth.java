import java.util.Scanner;

public class RichestCustomerWealth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] accounts = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }

        int maximumWealth = 0;

        for (int i = 0; i < rows; i++) {

            int wealth = 0;

            for (int j = 0; j < columns; j++) {
                wealth += accounts[i][j];
            }

            maximumWealth =
                Math.max(maximumWealth, wealth);
        }

        System.out.println(maximumWealth);

        sc.close();
    }
}
