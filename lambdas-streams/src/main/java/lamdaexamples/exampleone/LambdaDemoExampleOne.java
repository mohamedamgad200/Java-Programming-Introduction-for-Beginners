package lamdaexamples.exampleone;

import lamdaexamples.exampleone.Greeting;

public class LambdaDemoExampleOne {
    public static void main(String[] args) {
        Greeting greeting=(n)-> System.out.println(n);
        greeting.greeting("Hello Java Developer");
    }
}
