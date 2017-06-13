import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
       System.out.println("Please enter an integer");

        Scanner check= new Scanner(System.in);
/*
        int year=check.nextInt();

        if(year%4==0){
            if (year%100==0){
                if(year%400==0){
                    System.out.println(year+" is a leap year");
                } else System.out.println(year+ " is not a leap year");
            } else System.out.println(year + " is a leap year");
        } else System.out.println(year+ " is not a leap year");
*/
    int num=check.nextInt();

    if(num>0){
        System.out.println("it is positive");
    }
    else if(num<0){
        System.out.println("it is negative");
    }
    }
}


