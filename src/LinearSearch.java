import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        //Write a program to implement the linear search algorithm

        int[] list={3,5,6,7,2,8,4,9};

        Scanner input = new Scanner(System.in);
        int pos = -1;

        System.out.println("Please enter the integer whose index you will like to find");

        int index=input.nextInt();

        for(int i=0; i<list.length; i++){
            if(index==list[i]) {
                pos = i;
              //  System.out.println("The index is: " + i);
            }
        }
        if(pos>-1){
            System.out.println("The index is: " + pos);
        } else  System.out.println("The Integer was not found in the array, please try another");
    }
}
