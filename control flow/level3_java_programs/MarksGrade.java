import java.util.Scanner;
public class MarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;
        System.out.println("Average: " + percentage);
        if (percentage >= 90) System.out.println("Grade A Excellent");
        else if (percentage >= 75) System.out.println("Grade B Very Good");
        else if (percentage >= 50) System.out.println("Grade C Good");
        else System.out.println("Grade D Needs Improvement");
    }
}