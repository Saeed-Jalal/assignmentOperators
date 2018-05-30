public class assignmentOperators {

    //Assignment operators in java are: =, +=, -=, *=, /=, %=
    public static void main(String args[]){
        int num1 = 55;
        int num2 = 14;

        num2 = num1;
        //num2 = num1 would assign the value of num1 to num2
        System.out.println("= Output:" +num2);

        num2 += num1;
        //num2 += num1 is equal to num2=num2+num1
        System.out.println("+= Output:"+num2);
         num2 -= num1;
         //num2 -= num1 is equal to num2 = num2-num1
        System.out.println("-= Output" +num2);

        num2 *=num1;
        //num2 *=num1 is equal to num2 = num2*num1
        System.out.println("*= Output" +num2);

        num2 /= num1;
        //num2 /=num1is equal to num2=num2/num1
        System.out.println("/= Output" +num2);

        num2 %= num1;
        //num2 %=num1 is equal to num2 = num2%num1
        System.out.println("%= Output" +num2);

    }
}
