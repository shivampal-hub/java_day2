import java.util.Scanner;

public class SumUsingFor {
    static int n, sum = 0, i;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find sum");
        n = sc.nextInt();
        sum();
    }
    public static void sum(){
        for(i=1;i<=n;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
