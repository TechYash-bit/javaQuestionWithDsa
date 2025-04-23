package coreQuestion;

import java.util.Scanner;
//write a program to take radius or diameter as input and genrate area and circumfarance as output
public class Question5
{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("what shoulod you enter  :radius or diameter");
        String parameter=sc.nextLine();

        if(parameter.equalsIgnoreCase("radius")){
            System.out.println("Enter the size of radius");
            int radius=sc.nextInt();
            //float area= (radius * radius) * 3.14;
            float area = (radius * radius) * 3.14f;
            float circumfarance=radius*2*3.14f;

            System.out.println("area :"+area);
            System.out.println("circumfarance :"+circumfarance);

        }else if(parameter.equalsIgnoreCase(("diameter"))){
            System.out.println("enter the diameter of circle");
            int diameter=sc.nextInt();

            float area=((diameter*diameter)/4)*3.14f;
            float circumfarance=diameter*3.14f;

            System.out.println("area :"+area);
            System.out.println("circumfarance :"+circumfarance);
        }

    }
}
