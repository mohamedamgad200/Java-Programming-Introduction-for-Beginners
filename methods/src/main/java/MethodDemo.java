public class MethodDemo {
    public static void main(String[] args) {
        // call the method
        //displayGreetings();

        // call the method
        displayManyGreetings(3);
    }
    // define the method
    static void displayManyGreetings(int count){
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
