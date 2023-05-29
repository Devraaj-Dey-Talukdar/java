package AbdulBari_JavaCourse;

import java.util.Scanner;
class numInWord
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int d;
        String word = "";
        while(n>0)
        {
            d = n % 10;
            if (d == 1) {
                word = "one " + word;
            } else if (d == 2) {
                word = "two " + word;
            } else if (d == 3) {
                word = "three " + word;
            } else if (d == 4) {
                word = "four " + word;
            } else if (d == 5) {
                word = "five " + word;
            } else if (d == 0) {
                word = "zero " + word;
            }
            n = n /10;
        }
        System.out.println(word);
    }
}
