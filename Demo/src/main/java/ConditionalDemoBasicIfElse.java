import java.util.Scanner;

public class ConditionalDemoBasicIfElse {
    public static void main(String[] args) {
        /*
        int minVotingAge=18;
        int age=15;
        if(age>=minVotingAge){
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("Sorry, you are not eligible to vote.");
        }
         */
        /*
        Scanner scanner=new Scanner(System.in);
        int minVotingAge=18;
        System.out.print("What your age : ");
        int age=scanner.nextInt();
        if(age>=minVotingAge){
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("Sorry, you are not eligible to vote.");
        }
         */
        Scanner scanner=new Scanner(System.in);
        int minVotingAge=18;
        System.out.print("What your age : ");
        int age=scanner.nextInt();
        boolean eligible=age>=minVotingAge;
        System.out.println("eligible "+eligible);
        if(eligible){
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("Sorry, you are not eligible to vote.");
        }
        scanner.close();
    }
}
