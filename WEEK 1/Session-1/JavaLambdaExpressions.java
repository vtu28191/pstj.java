import java.util.Scanner;

public class JavaLambdaExpressions {

    interface PerformOperation {
        boolean check(int n);
    }

    static PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    static PerformOperation isPrime() {
        return n -> {
            if (n < 2) {
                return false;
            }

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        };
    }

    static PerformOperation isPalindrome() {
        return n -> {
            int original = n;
            int reverse = 0;

            while (n > 0) {
                reverse = reverse * 10 + n % 10;
                n /= 10;
            }

            return original == reverse;
        };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int type = sc.nextInt();
            int number = sc.nextInt();

            PerformOperation operation;

            if (type == 1) {
                operation = isOdd();
            } else if (type == 2) {
                operation = isPrime();
            } else {
                operation = isPalindrome();
            }

            System.out.println(
                operation.check(number) ? "YES" : "NO"
            );
        }

        sc.close();
    }
}
