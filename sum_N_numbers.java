package AbdulBari_JavaCourse;

import java.util.Scanner;
public class sum_N_numbers
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++){
            System.out.println(sum+"+"+i+"="+(sum+i));
            sum = sum + i ;
        }
        System.out.println(sum);
    }
} 