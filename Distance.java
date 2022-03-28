import java.util.Scanner;

public class Distance {
    static int x, y;
    static double distance, d;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x co-ordinate: ");
        x = sc.nextInt();
        System.out.println("x: "+x);
        System.out.println("Enter value of y co-ordinate: ");
        y = sc.nextInt();
        System.out.println("y: "+y);
        euclidean();
        System.out.println("Euclidean Distance is: "+distance);
    }
    public static void euclidean(){
        d = (x*x) + (y*y);
        distance = Math.pow(d, 0.5);
    }
}
