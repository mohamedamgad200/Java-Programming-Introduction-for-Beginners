public class MethodOverloading {
    public static void main(String[] args) {
        displayGreetings(3);
    }
    // define the method
    static void displayGreetings(int count){
        for(int i=1;i<=count;i++)
        {
            //refactoring
            //System.out.println("Hello world!");
            //System.out.println("Welcome, welcome.");
            //System.out.println("Please make yourself at home.");
            displayGreetings();
            System.out.println();
        }
    }
    // define the method
    static void displayGreetings(){
        System.out.println("Hello world!");
        System.out.println("Welcome, welcome.");
        System.out.println("Please make yourself at home.");
    }
}
