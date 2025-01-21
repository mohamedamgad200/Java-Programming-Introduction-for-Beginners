import java.util.Scanner;

public class ConditionalDemoIfElseIf {
    public static void main(String[] args) {
        /*
        double scoreOnExam=81.0;
        double firstTierScoreMin=90.0;
        double secondTierScoreMax=80.0;
        if(scoreOnExam>=firstTierScoreMin) {
            System.out.println("You scored in the first tier.");
        } else if (scoreOnExam>=secondTierScoreMax) {
            System.out.println("You scored in the second tier.");
        }else{
            System.out.println("Low grade. You did not score in the top two tiers.");
        }

         */
        double firstTierScoreMin=90.0;
        double secondTierScoreMax=80.0;
        Scanner scanner=new Scanner(System.in);
        double scoreOnExam=scanner.nextDouble();
        if(scoreOnExam>=firstTierScoreMin) {
            System.out.println("You scored in the first tier.");
        } else if (scoreOnExam>=secondTierScoreMax) {
            System.out.println("You scored in the second tier.");
        }else{
            System.out.println("Low grade. You did not score in the top two tiers.");
        }
    }
}
