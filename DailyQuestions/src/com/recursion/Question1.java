package com.recursion;
//print your name 5 times using recursion

public class Question1 {
    //creating a print recursive function
    static void print(int count){

        if(count>5){
            return;
        }
        System.out.println("yash Niranjan Harne");

        print(count+1);
        count++;
    }
    // creating a main function
    public static void main(String args[]){
        int count=1;
        print( count);


    }
}
