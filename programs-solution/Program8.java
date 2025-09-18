//3. Celsius to Fahrenheit Conversion
//Write a program that takes the temperature in Celsius as input and converts
//it to Fahrenheit using the formula:
//Fahrenheit = (Celsius * 9/5) + 32.



import java.util.Scanner;
public class Program8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float Celsius= input.nextFloat();
        double Fahrenheit = (Celsius * 9/5) + 32;



        System.out.println("The temperature in celcius =>" +
                " Fahrenheit " +
                "is "+ Fahrenheit );


    }
}
