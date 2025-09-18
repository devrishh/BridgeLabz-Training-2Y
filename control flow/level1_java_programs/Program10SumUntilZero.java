import java.util.Scanner;
public class Program10SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            double x = sc.nextDouble();
            if (x == 0) break;
            total += x;
        }
        System.out.println("Total: " + total);
    }
}