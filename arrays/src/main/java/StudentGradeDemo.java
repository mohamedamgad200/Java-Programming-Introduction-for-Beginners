import java.util.Scanner;

public class StudentGradeDemo {
    public static void main(String[] args) {
        /*
        double[]grades=new double[3];
        grades[0]=100;
        grades[1]=76.7;
        grades[2]=89.0;
        for (double grade:grades)
        {
            System.out.println(grade);
        }
         */
        // prompt the user for how many grades
        Scanner scanner=new Scanner(System.in);
        System.out.print("How many grades will you enter?");
        int numberOfStudents=scanner.nextInt();

        System.out.println();
        // initialize the array based on the number of grades
        double []userInputGrades=new double[numberOfStudents];
        // read each grade and assign to an array element
        for(int i=0;i<userInputGrades.length;i++)
        {
            System.out.print("Enter grade number "+(i+1)+": ");
            userInputGrades[i]=scanner.nextDouble();
        }
        System.out.println();
        // print out the array elements
        for(double grade:userInputGrades)
        {
            System.out.println(grade);
        }
        scanner.close();
    }
}
