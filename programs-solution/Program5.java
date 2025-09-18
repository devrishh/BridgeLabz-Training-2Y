//Write a program that takes the distance in kilometers as input from the user
//and converts it into miles using the formula:
//Miles = Kilometers * 0.621371.

import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float km= input.nextFloat();
        double miles = km * 0.621371;



        System.out.println("the result of kilometers in " +
                        "miles" +
                " is "+miles);


    }
}