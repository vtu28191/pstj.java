import java.util.*;

public class JavaDeque {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();

        int maximumUnique = 0;

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            deque.addLast(value);
            set.add(value);

            if (deque.size() > m) {

                int removed = deque.removeFirst();

                if (!deque.contains(removed)) {
                    set.remove(removed);
                }
            }

            maximumUnique =
                Math.max(maximumUnique, set.size());
        }

        System.out.println(maximumUnique);

        sc.close();
    }
}
