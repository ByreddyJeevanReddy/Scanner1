import java.util.Scanner;

public class NewTopic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Student Name:");
        String studentName = sc.nextLine();

        System.out.println("College Name:");
        String collegeName = sc.nextLine();

        System.out.println("Grade:");
        char grade = sc.next().charAt(0);

        System.out.println("Marks Scored:");
        int marksScored = sc.nextInt();

        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + collegeName);
        System.out.println("Grade: " + grade);
        System.out.println("Marks Scored: " + marksScored);


    }
}



