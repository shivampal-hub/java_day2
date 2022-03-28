import java.util.Scanner;

public class Quadratic {
    static double a, b, c, delta, x1, x2;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        a = sc.nextDouble();
        System.out.println("Enter value of b: ");
        b = sc.nextDouble();
        System.out.println("Enter value of c: ");
        c = sc.nextDouble();
        sqrt();
}
public static void sqrt(){
        delta = (b*b) - (4*a*c);
        //x1 and x2 are roots of quadratic equation
    x1 = (-b + Math.sqrt(delta))/(2*a);
    x2 = (-b - Math.sqrt(delta))/(2*a);
    System.out.println("The roots of the quadratic equation are: "+x1+ +x2);
}
}
