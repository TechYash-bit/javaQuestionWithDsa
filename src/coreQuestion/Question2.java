package coreQuestion;

import java.util.Scanner;

//write a program to take input side of rectangle and genrate perimeter and area as output
public class Question2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the width of a rectangle");
        int width=sc.nextInt();
        System.out.println("enter the length of rectangle");
        int length=sc.nextInt();

        int perimeter=2*(length+width);
        int area=length*width;
        System.out.println("the perimeter of rectangle is"+perimeter);
        System.out.println("the area of rectangle is"+area);
    }
}
