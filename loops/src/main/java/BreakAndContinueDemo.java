public class BreakAndContinueDemo {
    public static void main(String[] args) {
        //example using break
        for(int i=1;i<=10;i++)
        {
            if(i==5)
            {
                break;
            }
            System.out.println("Counter: "+i);
        }
        /*
        counter: 1
        counter: 2
        counter: 3
        counter: 4
         */
        System.out.println("*********************************");
        //example using continue
        for(int i=1;i<=10;i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.println("Counter: "+i);
        }
         /*
        counter: 1
        counter: 2
        counter: 3
        counter: 4
        counter: 6
        counter: 7
        counter: 8
        counter: 9
        counter: 10

         */
    }
}
