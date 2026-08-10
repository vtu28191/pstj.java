import java.util.*;

public class SortCharactersByFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        Map<Character, Integer> frequency =
            new HashMap<>();

        for (char c : s.toCharArray()) {

            frequency.put(
                c,
                frequency.getOrDefault(c, 0) + 1
            );
        }

        List<Character> characters =
            new ArrayList<>(frequency.keySet());

        characters.sort((a, b) ->
            frequency.get(b) - frequency.get(a)
        );

        StringBuilder result =
            new StringBuilder();

        for (char c : characters) {

            for (int i = 0;
                 i < frequency.get(c);
                 i++) {

                result.append(c);
            }
        }

        System.out.println(result);

        sc.close();
    }
}
