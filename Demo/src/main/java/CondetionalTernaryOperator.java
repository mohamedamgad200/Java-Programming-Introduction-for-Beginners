public class CondetionalTernaryOperator {
    public static void main(String[] args) {
        int minVotingAge=18;
        int age=15;
        /*
        String message=null;
        if(age >= minVotingAge){
            message="You are eligible to vote";
        }else{
            message= "You are NOT eligible to vote";
        }
        System.out.println("message : "+message);
         */
        //Ternary Operator
        String message=age>=minVotingAge?"You are eligible to vote":"You are NOT eligible to vote";
        System.out.println("message : "+message);
    }
}
