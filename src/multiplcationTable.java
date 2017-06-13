import java.util.Scanner;

public class multiplcationTable {
    public static void main(String[] args) {

        System.out.println("Please enter a number to try out my Multiplication tables ");

        Scanner accept= new Scanner(System.in);

        int a=accept.nextInt();

        for(int i=1; i<11;i++){
            int b=a*i;
            System.out.println(a+" * "+i+" = "+b);
        }
    }
}
