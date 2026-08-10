import java.util.*;

public class MaximumSubarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int currentSum = nums[0];
        int maximumSum = nums[0];

        for (int i = 1; i < n; i++) {

            currentSum =
                Math.max(nums[i], currentSum + nums[i]);

            maximumSum =
                Math.max(maximumSum, currentSum);
        }

        System.out.println(maximumSum);

        sc.close();
    }
}
