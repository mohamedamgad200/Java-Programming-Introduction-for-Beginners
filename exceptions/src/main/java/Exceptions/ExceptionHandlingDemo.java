package Exceptions;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        String numberString="luv2code";
        try{
           int numberInt=Integer.parseInt(numberString);
        }catch(Exception e)
        {
            System.out.println(e);
            System.out.println("You cannot parse this String");
        }
    }
}
