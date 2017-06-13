import java.util.Scanner;

public class AphabeticalArrangement {
    public static void main(String[] args) {
        //this program takes the names of 10 states and arranges them in alphabetical other

        String[] unsortedStates= new String[5];
        String[] sortedStates=new String[5];
        String[] temp= new String[5];

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the states to be sorted");

        for(int i=0; i<5; i++){
            unsortedStates[i]=input.next();

        }

        for (int i=0; i<5; i++){

            for (int j=0; j<5; j++){
                if(unsortedStates[i].compareTo(unsortedStates[j])>0){
                    temp[i]= unsortedStates[i];
                    unsortedStates[i]=unsortedStates[j];
                    sortedStates[j]=temp[i];

                }
            }



            }
        System.out.println("sorted States");
        for(int i=0; i<5; i++){
            System.out.println(sortedStates[i]);
        }


    }
}
