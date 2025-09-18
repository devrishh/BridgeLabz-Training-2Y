//Write a program to calculate the perimeter of a rectangle. Take the length
//and width as inputs and use the formula:

import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length= input.nextInt();
        int width= input.nextInt();

        double perimeter =(length+width)*2;

        System.out.println("the perimeter of the rectangle of dimentions "+ length +" X "+width+" is "+perimeter);


    }
}