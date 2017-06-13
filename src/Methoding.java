public class Methoding {
    //This program sums the natural numbers between 1 and 100
    public static int sumEven(int i, int j){
        int result = 0;
        for (int a=(i+1); a<=j; a=a+2){
            result +=a;

        }
        return result;
    }

    public static int sumOdd(int i, int j){
        int result = 0;
        for (int b=i; b<=j; b=b+2){
            result +=b;

        }
        return result;
    }

    public static int sumTotal(int i, int j){
        int result = i+j;

        return result;
    }


    public static void main(String[] args) {
        int even=sumEven(1,100);

        System.out.println("The total sum of all even numbers in the first 100 natural number is: "+even);
        int odd= sumOdd(1,100);

        System.out.println("The total sum of all odd numbers in the first 100 natural number is: "+odd);

        int total = sumTotal(even,odd);

        System.out.println("The total sum of the first 100 natural numbers is: "+total);
    }
}
