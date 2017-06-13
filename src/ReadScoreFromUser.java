import java.util.Scanner;

public class ReadScoreFromUser {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[] sccoreStore= new int[10];
        System.out.println("Please input the scores of the student");


        for(int i=0; i<10;i++){

            sccoreStore[i]=input.nextInt();
        }

        for (int i=0;i<10;i++){
            System.out.println("The scores are: "+ sccoreStore[i]);
        }

    }
}
