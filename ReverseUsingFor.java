import java.util.Scanner;

public class ReverseUsingFor {
    static int n, reverse = 0, remainder;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        n = sc.nextInt();
        reverse();
    }
    public static void reverse(){
        for(;n!=0; n=n/10) {
            remainder = n % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println(reverse);
    }
}
