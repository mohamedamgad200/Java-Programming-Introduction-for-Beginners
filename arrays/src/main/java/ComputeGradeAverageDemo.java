import java.util.Scanner;

public class ComputeGradeAverageDemo {
    public static void main(String[] args) {
        // prompt the user for how many grades
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many grades will you enter?");
        int numberOfStudents = scanner.nextInt();

        System.out.println();
        // initialize the array based on the number of grades
        double[] userInputGrades = new double[numberOfStudents];
        // read each grade and assign to an array element
        for (int i = 0; i < userInputGrades.length; i++) {
            System.out.print("Enter grade number " + (i + 1) + ": ");
            userInputGrades[i] = scanner.nextDouble();
        }
        System.out.println();
        // print out the array elements
        for (double grade : userInputGrades) {
            System.out.println(grade);
        }
        System.out.println();
        double gradeAverage = computeGradeAverage(userInputGrades);
        System.out.println("Grade Average: " + gradeAverage);
        scanner.close();
    }

    public static double computeGradeAverage(double[] userInputGrades) {
        double sum = 0.0;
        // compute the sum of the grades
        for (int i = 0; i < userInputGrades.length; i++) {
            sum += userInputGrades[i];
        }
        // compute the grade average, based on length of the array
        // double average = sum / userInputGrades.length;
        // return average;
        return sum / userInputGrades.length;
    }
}
