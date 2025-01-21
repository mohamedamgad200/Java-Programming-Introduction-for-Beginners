public class CompareStrings {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        boolean result1=(s1==s2);
        System.out.println("s1: "+s1);//Hello
        System.out.println("s2: "+s2);//Hello
        System.out.println("s1==s2 : "+result1);//true
        System.out.println();
        String s3=new String("Hello");
        boolean result2=(s1==s3);
        System.out.println("s1: "+s1);//Hello
        System.out.println("s3: "+s3);//Hello
        System.out.println("s1==s3 : "+result2);//false
        System.out.println();
        boolean result3=s1.equals(s3);
        System.out.println("s1.equals(s3): "+result3);
        System.out.println();
        String s4="hello";
        System.out.println("s1: "+s1);//Hello
        System.out.println("s4: "+s4);//hello
        boolean result4=s1.equalsIgnoreCase(s4);//true
        System.out.println("s1.equalsIgnoreCase(s4): "+result4);
        System.out.println();

    }
}
