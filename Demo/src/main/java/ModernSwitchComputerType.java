import java.util.Locale;
import java.util.Scanner;

public class ModernSwitchComputerType {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your computer type:  ");
        String computerType=scanner.nextLine();
        computerType=computerType.toLowerCase();
        //version 1
        /*
        switch (computerType){
            case "smartphone"-> System.out.println("Smartphones offer computing power in your hand.");
            case "tablet"-> System.out.println("Tablets are lightweight for browsing and light tasks.");
            case "laptop"-> System.out.println("Laptops are portable for work on the go.");
            case "desktop"-> System.out.println("Desktops excel in gaming and work related tasks.");
            default -> System.out.println("Unknown computer type.");
        }
         */
        String description=switch (computerType){
            case "smartphone"->"Smartphones offer computing power in your hand.";
            case "tablet"->"Tablets are lightweight for browsing and light tasks.";
            case "laptop"->"Laptops are portable for work on the go.";
            case "desktop"->"Desktops excel in gaming and work related tasks.";
            default -> "Unknown computer type.";
        };
        System.out.println("Description: "+description);
        scanner.close();
    }
}
