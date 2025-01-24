public class ArrayDemo {
    public static void main(String[] args) {
        // initialize the array
        String[] colors = {"Blue", "Green", "Red", "Yellow"};
        // display contents of the array
        System.out.println("Contents of the array:");
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        // display length of the array
        System.out.println("Length of the array: " + colors.length);
        //Looping Through an Array - Version 1
        System.out.println("Looping Through an Array - Version 1:");
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
        //Looping Through an Array - Version 2
        System.out.println("Looping Through an Array - Version 2:");
        for(String temp:colors)
        {
            System.out.println(temp);
        }
    }
}
