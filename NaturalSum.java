import java.util.Scanner;

public class NaturalSum {
    static int n, sum = 0, i=1;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find sum");
        n = sc.nextInt();
        sum();
    }
     static void sum(){
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
