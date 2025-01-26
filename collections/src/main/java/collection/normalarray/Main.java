package collection.normalarray;

public class Main {
    public static void main(String[] args) {
        String[]todoItems=new String[3];
        todoItems[0]="Take out the trash";
        todoItems[1]="Clean the dishes";
        todoItems[2]="Prep dinner";
        for(String item:todoItems)
        {
            System.out.println(item);
        }

        todoItems[3]="Clean bathroom";//Index 3 out of bounds for length 3
        System.out.println("Exception");
    }
}
