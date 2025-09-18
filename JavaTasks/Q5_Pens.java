// Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get.
public class Q5_Pens {
    public static void main(String[] args) {
        int pens = 14, students = 3;
        int perStudent = pens / students;
        int remaining = pens % students;
        System.out.println("The Pen Per Student is " + perStudent + " and the remaining pen not distributed is " + remaining);
    }
}