import java.util.Scanner;

public class Unit {
    static int a;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a single digit number");
        a = sc.nextInt();
        ten();
    }
    static void ten(){
        if(a == 1){
            System.out.println("unit");
        }
        else if( a == 10){
            System.out.println("ten");
        }
        else if(a == 100){
            System.out.println("Hundred");
        }
        else if(a ==1000 ){
            System.out.println("Thousand");
        }
    }

}
