package lamdaexamples.predicateexample;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> lessThan100 = (i) -> (i < 100);
        boolean result1 = lessThan100.test(10);
        System.out.println(result1);//true
        Predicate<Integer> greaterThan50 = i -> (i > 50);
        boolean result2=greaterThan50.test(100);
        System.out.println(result2);//true
        // and()
        boolean result3=lessThan100.and(greaterThan50).test(55);//true //true ==>true
        System.out.println(result3);
        boolean result4=lessThan100.or(greaterThan50).test(110);//true
        System.out.println(result4);
        boolean result5=lessThan100.negate().test(20);//false
        System.out.println(result5);
    }
}
