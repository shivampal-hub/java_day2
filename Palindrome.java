import java.util.Scanner;

public class Palindrome {
    static int n, reverse = 0, remainder, original;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find Palindrome");
        n = sc.nextInt();
        original = n;
        reverse();
    }

    public static void reverse() {
        while (n != 0) {
            remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n /= 10;
        }
        if (original == reverse) {
            System.out.println("Palindrome:" + original);
        }
        else {
            System.out.println("Not a Palindrome:" + reverse);
        }
    }
}
