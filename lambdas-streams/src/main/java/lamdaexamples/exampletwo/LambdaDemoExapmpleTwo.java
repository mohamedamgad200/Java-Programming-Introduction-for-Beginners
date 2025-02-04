package lamdaexamples.exampletwo;

public class LambdaDemoExapmpleTwo {
    public static void main(String[] args) {
        StringEndings exclamationMark=(s)->s+" ! ";
        System.out.println(exclamationMark.perform("Hello"));
        String a="Milo";
        String b="Tester";
        StringCompare value=(s1,s2)->{
            if(s1.length()>s2.length())
            {
                return s1;
            }
            return s2;
        };
        System.out.println(value.perform(a,b));
    }
}
