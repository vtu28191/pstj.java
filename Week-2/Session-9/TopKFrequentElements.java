import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            frequency.put(
                num,
                frequency.getOrDefault(num, 0) + 1
            );
        }

        List<Integer> elements =
            new ArrayList<>(frequency.keySet());

        elements.sort(
            (a, b) -> frequency.get(b) - frequency.get(a)
        );

        for (int i = 0; i < k; i++) {
            System.out.print(elements.get(i) + " ");
        }

        sc.close();
    }
}
