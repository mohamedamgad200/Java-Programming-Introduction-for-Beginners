import java.util.Scanner;

public class ComputeGradeAverageDemoV2 {
    public static void main(String[] args) {
        double[] userInputGrades = readUserInputGrades();
        System.out.println();
        // print out the array elements
        displayGrades(userInputGrades);
        System.out.println();
        //compute average
        double gradeAverage = computeGradeAverage(userInputGrades);
        System.out.println("Grade Average: " + gradeAverage);
    }

    public static double computeGradeAverage(double[] userInputGrades) {
        double sum = 0.0;
        // compute the sum of the grades
        for (int i = 0; i < userInputGrades.length; i++) {
            sum += userInputGrades[i];
        }
        // compute the grade average, based on length of the array
        return sum / userInputGrades.length;
    }

    private static double[] readUserInputGrades() {
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
        scanner.close();
        return userInputGrades;
    }

    private static void displayGrades(double[] userInputGrades) {
        for (double grade : userInputGrades) {
            System.out.println(grade);
        }
    }
}
