import java.util.Scanner;

public class ExceptionHanfling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an Integer: ");
            int number= scanner.nextInt();
            System.out.println("The number entered is "+number);
        }
        catch(Exception e){
            System.out.println("Try again. ["+"Incorrect input: an integer is required]");
            scanner.nextInt();//discard input
        }
    }
}
