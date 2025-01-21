import java.util.Scanner;

public class NumberDemo {
    public static void main(String[] args) {
        /*
        double gradeExam1=87.5;
        double gradeExam2=100;
        double gradeExam3=66.50;
        double gradeAverage=(gradeExam1+gradeExam2+gradeExam3)/3;
        System.out.println("Grade Exam 1 "+gradeExam1);
        System.out.println("Grade Exam 2 "+gradeExam2);
        System.out.println("Grade Exam 3 "+gradeExam3);
        System.out.println("Grade average "+gradeAverage);
        String formattedAverage=String.format("%.2f",gradeAverage);
        System.out.println("Formatted Average "+formattedAverage);
         */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter grade exam1: ");
        double gradeExam1=scanner.nextDouble();
        System.out.print("Enter grade exam2: ");
        double gradeExam2=scanner.nextDouble();
        System.out.print("Enter grade exam3: ");
        double gradeExam3=scanner.nextDouble();
        double gradeAverage=(gradeExam1+gradeExam2+gradeExam3)/3;
        System.out.println("Grade Exam 1 "+gradeExam1);
        System.out.println("Grade Exam 2 "+gradeExam2);
        System.out.println("Grade Exam 3 "+gradeExam3);
        System.out.println("Grade average "+gradeAverage);
        String formattedAverage=String.format("%.2f",gradeAverage);
        System.out.println("Formatted Average "+formattedAverage);
    }
}
