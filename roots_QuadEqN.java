package AbdulBari_JavaCourse;
import java.util.Scanner;
public class roots_QuadEqN{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        double r1 , r2 ;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        r1 = (-b+Math.sqrt(b*b-4*a*c))/2*a;
        r2 = (-b-Math.sqrt(b*b-4*a*c))/2*a;
        System.out.println("Roots are "+r1+"  "+r2);
        
    }
}