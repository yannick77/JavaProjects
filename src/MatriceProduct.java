
import java.util.Scanner;

public class MatriceProduct {

    public static void readInput(int[][] array){

        System.out.println("Input the values for this array\n");
        Scanner input = new Scanner(System.in);

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                array[i][j]= input.nextInt();

            }
        }
    }




    public static int[][] findSum(int[][] first, int[][] second){
        int[][]sum= new int[3][3];

        for (int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {

                sum[i][j] = first[i][j] + second[i][j];
            }
        }

        return sum;
    }

    public static void writeResult(int[][] sum){
        System.out.println("The sum of the matrices is displayed below\n");
        //int[][]sum= new int[3][3];

        for (int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(sum[i][j]+"\t");

               // sum[i][j] = first[i][j] + second[i][j];
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        int[][] a=new int[3][3];
        int[][] b= new int[3][3];
        int[][] sum = new int[3][3];

     //   System.out.println("Please enter values for the first 3*3 Matrix");
        readInput(a);

       // System.out.println("Please enter values for the second 3*3 Matrix");
        readInput(b);

        sum = findSum(a,b);

        writeResult(sum);
    }
}
