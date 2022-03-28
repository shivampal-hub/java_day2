import java.util.Scanner;

public class VowelConsonant {
    static char s1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        s1 = sc.next().charAt(0);
        vowel();
    }

    public static void vowel() {
        switch (s1) {
            case 'a':
                System.out.println("Vowel:" + s1);
                break;
            case 'e':
                System.out.println("Vowel:" + s1);
                break;
            case 'i':
                System.out.println("Vowel:" + s1);
                break;
            case 'o':
                System.out.println("Vowel:" + s1);
                break;
            case 'u':
                System.out.println("Vowel:" + s1);
                break;
            default:
                System.out.println("Consonant:" + s1);
        }
    }
}
