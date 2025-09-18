//Write a program that takes two numbers as input: a base and an exponent,
//and prints the result of base raised to the exponent (without using loops or
//conditionals).

import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base= input.nextInt();
        int exponent= input.nextInt();
        double result=1;
        for (int i=0; i<exponent;i++){
            result*=base;
        }


        System.out.println("the result is "+ base +"^"+exponent+
                " is "+result);


    }
}