package AbdulBari_JavaCourse;

import java.util.Scanner;
public class prod_table
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number to find its product table :");
        int num = sc.nextInt();
        System.out.println("Enter limit");
        int lim = sc.nextInt();
        for(int i=1;i<=lim;i++){
            System.out.println(num+"*"+i+"="+(num*i));
        }
        
    }
}
