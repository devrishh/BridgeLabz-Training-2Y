//Write a program that takes three numbers as input from the user and prints
//their average.

import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();

        double avg =(num1 + num2 + num3 )/3;

        System.out.println("the avg of three number "+num1 + " "+num2+" "+num3+ " is "+avg);

    }
}

