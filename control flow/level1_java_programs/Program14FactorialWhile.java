import java.util.Scanner;
public class Program14FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0) {
            int f = 1;
            int i = 1;
            while (i <= n) {
                f *= i;
                i++;
            }
            System.out.println("Factorial of " + n + " is " + f);
        } else {
            System.out.println("Not a natural number");
        }
    }
}