package AbdulBari_JavaCourse;

import java.util.Scanner;
class young{
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println();
        if(age<=25){
        System.out.println("You are young");
        }
        else System.out.println("You are not young");
        }
}