import java.util.Scanner;

public class SentinelTerminator {
    public static void main(String[] args) {
        System.out.println("Please enter values of integers to add or enter -99 to quit");
        int sum=0;
        int num=0;

        Scanner input= new Scanner(System.in);
      do {
           num = input.nextInt();
         if(num!=-99){

             sum=sum+num;
         }
      }
        while (num !=-99);

        System.out.println("the sum of integers entered is "+sum);
    }
}
