import java.util.Scanner;

public class NumberUtilityToolkit {

    public static boolean isPrime(int n) {

        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static boolean isPalindrome(int n) {

        if (n < 0) return false;

        int original = n;
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        return original == reverse;
    }

    public static long factorial(int n) {

        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers");
            return -1;
        }

        if (n > 20) {
            System.out.println("Factorial too large (limit: 20)");
            return -1;
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static int reverseNumber(int n) {

        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            sc.close();
            return;
        }

        int num = sc.nextInt();

        System.out.println("Prime: " + isPrime(num));
        System.out.println("Palindrome: " + isPalindrome(num));

        long fact = factorial(num);
        if (fact != -1) {
            System.out.println("Factorial: " + fact);
        }

        System.out.println("Reversed: " + reverseNumber(num));

        sc.close();
    }
}