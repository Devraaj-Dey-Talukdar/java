package AbdulBari_JavaCourse;

import java.util.Scanner;
public class numRev
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int d;
        while (n>0){
            d = n % 10;
            rev = rev*10 + d ;  
            n = n/10;
        }
        System.out.println(rev);
    }
}
// suppose 257 is input , then 257 % 10 = 7 ,
//then 23 % 10 gives 3 now here we multiply 7 with 10 and add 3 and repeat till condition is false and loop ends
