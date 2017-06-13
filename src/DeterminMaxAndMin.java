import java.util.Scanner;

public class DeterminMaxAndMin {
    public static void main(String[] args) {
        //A Program to determine the Max and Min of six(6) numbers


        Scanner input = new Scanner(System.in);

        int[] myArray= new int[6];



        for(int i=0; i<6;i++){
            myArray[i]=input.nextInt();
        }
        int max=myArray[0];
        int min=myArray[0];

        for(int i=1; i<6;i++){


            if(myArray[i]>max){
                max=myArray[i];
            }

            if(myArray[i]< min){
                min=myArray[i];
            }
        }


        System.out.println("The largest integer is: "+max+" and the Smallest integer is: "+min);


    }
}
