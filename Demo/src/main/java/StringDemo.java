public class StringDemo {
    public static void main(String[] args) {
        /*
        var message="Hello World!";
        var extra="I Love coding";
        */
        String message="Hello World!";
        String extra="I Love coding";
        System.out.println(message);
        System.out.println(message+" "+extra);
        System.out.println("Length of "+message+" is "+message.length());
        System.out.println("Upper case Version of "+message+" is "+message.toUpperCase());
        System.out.println("Lower Case Version of "+message+" is "+message.toLowerCase());

        String combo=message+" "+extra;
        System.out.println(combo);

        String upperVersion=combo.toUpperCase();
        System.out.println(upperVersion);
    }
}
