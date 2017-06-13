import java.util.Scanner;

public class tut1 {

    public static void main(String[] args) {

        float principal;
        float interestRate;

        Scanner start = new Scanner(System.in);

        System.out.println("Please enter starting balance: ");

        principal=start.nextFloat();


        System.out.println("Please enter annual interest rate: ");
        
       interestRate=start.nextFloat();


        float firstBalance =calculateInterest(principal,interestRate);


        System.out.println("Balance after one year= "+firstBalance);

        float secondBalance = calculateInterest(6255,interestRate);

        System.out.println("Balance after two years= "+secondBalance);

    }



    public static float calculateInterest(float a, float b){
        float interest= a*b/100;

        float balance = interest+a;

        return balance;
    }

}
