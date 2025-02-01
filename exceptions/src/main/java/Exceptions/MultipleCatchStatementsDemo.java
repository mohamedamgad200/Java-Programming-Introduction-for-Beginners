package Exceptions;

public class MultipleCatchStatementsDemo {
    public static void main(String[] args) {
        String numberString = "luv2code";
    }

    public static void parseString(String numberString) {
        try {
            System.out.println(numberString.length());
            int numberInt = Integer.parseInt(numberString);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("String needs to be valid int");
        } catch (Exception e) {
            System.out.println();
        }
    }
}
