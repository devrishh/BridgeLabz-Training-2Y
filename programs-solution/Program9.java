//4. Area of a Circle
//Write a program to calculate the area of a circle. Take the radius as input
//and use the formula:
//Area = π * radius^2.
import java.util.Scanner;
public class Program9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float radius = input.nextFloat();
        double Area = 3.14 * radius*radius;

        System.out.println("The area is : "+ Area);
    }

}
