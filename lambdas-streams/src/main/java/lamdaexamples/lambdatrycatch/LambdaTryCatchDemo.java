package lamdaexamples.lambdatrycatch;

public class LambdaTryCatchDemo {
    public static void main(String[] args) {
        Calculate divide = (a, b) -> {
            try {
                return a / b;
            } catch (ArithmeticException e) {
                e.printStackTrace();
                return -1;
            }
        };
//        int solution=divide.perform(10,0);
//        System.out.println(solution);//catch error
        int solution = divide.perform(10, 2);
        System.out.println(solution);//5
    }

}
