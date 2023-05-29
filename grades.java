package AbdulBari_JavaCourse;

import java.util.Scanner;
class grades {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter marks of 3 subjects : ");
       double m1 = sc.nextDouble();
       double m2 = sc.nextDouble();
       double m3 = sc.nextDouble();
       double avg = (m1+m2+m3)/3;
       if(avg>90&&avg<100){
          System.out.println("Grade A");
        }
       else if(avg>80&&avg<90)System.out.println("Grade B");
       else if (avg>70&&avg<80)System.out.println("Grade C");
       else System.out.println("Grade C");
    }
}