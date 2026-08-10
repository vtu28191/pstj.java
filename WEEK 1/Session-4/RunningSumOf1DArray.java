import java.util.Scanner;

public class RunningSumOf1DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
