//Write a program to calculate the volume of a cylinder. Take the radius and
//height as inputs and use the formula:
//Volume = π * radius^2 * height.



import java.util.Scanner;
public class Program10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float radius = input.nextFloat();
        float height = input.nextFloat();
        double Volume = 3.14 * radius * radius * height;

        System.out.println("The Volume is : "+ Volume);
    }

}

