import java.util.Scanner;

public class ConditionalDemoCompoundAndNested {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        int maxClassCount=3;
        int minClassCount=2;
        System.out.print("Enter your class count");
        int userClassCount=scanner.nextInt();
        System.out.println("userClassCount= "+userClassCount);
        System.out.println("maxClassCount= "+maxClassCount);
        System.out.println("minClassCount= "+minClassCount);
        if(userClassCount<=maxClassCount&&userClassCount>=minClassCount)
        {
            System.out.println("Your class count is in the recommended range");
        }else{
            System.out.println("Your class count is outside of the recommended range");
        }
        */
        int maxClassCount=3;
        int minClassCount=2;
        System.out.print("Enter your class count");
        int userCount=scanner.nextInt();
        System.out.println("userClassCount= "+userCount);
        System.out.println("maxClassCount= "+maxClassCount);
        System.out.println("minClassCount= "+minClassCount);
        if(userCount<=maxClassCount&&userCount>=minClassCount)
        {
            System.out.println("Your class count is in the recommended range");
            //check if usercount is even or odd
            if((userCount%2)==0){
                System.out.println("You have selected an even number of classes.");
            }else{
                System.out.println("You have selected an odd number of classes.");
            }
        }else{
            System.out.println("Your class count is outside of the recommended range");
        }
        scanner.close();
    }
}
