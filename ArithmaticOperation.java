import java.util.Scanner;

public class ArithmaticOperation {
    static int a, b, c, d, e, f, g;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        a = sc.nextInt();
        System.out.println("Enter value of b: ");
        b = sc.nextInt();
        System.out.println("Enter value of c: ");
        c = sc.nextInt();
        operation();
        if((d>e)&&(d>f)&&(d>g)){
            System.out.println("Max: "+d);
        }
        else if((e>d)&&(e>f)&&(e>g)){
            System.out.println("Max: "+e);
        }
        else if((f>d)&&(f>e)&&(f>g)){
            System.out.println("Max: "+f);
        }
        else{
            System.out.println("Max: "+g);
    }
        if((d<e)&&(d<f)&&(d<g)){
            System.out.println("Min: "+d);
        }
        else if((e<d)&&(e<f)&&(e<g)){
            System.out.println("Min: "+e);
        }
        else if((f<d)&&(f<e)&&(f<g)){
            System.out.println("Min: "+f);
        }
        else{
            System.out.println("Min: "+g);
        }
    }
    public static void operation(){
        d = a+b*c;
        e = c+b/c;
        f = a%b+c;
        g = a*b+c;
    }

    }

