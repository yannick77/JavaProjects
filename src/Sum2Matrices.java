import java.util.Scanner;

public class Sum2Matrices {
    public static void main(String[] args) {
// sum two 3*3 arrays
     //   Scanner input= new Scanner(System.in);

        int[][] matriceA={{1,2,3},{4,5,6},{7,8,9}};
        int[][] matriceB= {{1,2,3},{4,5,6},{7,8,10}};
        int[][]sum={{0,0,0},{0,0,0},{0,0,0}};

        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){


                sum[i][j]=matriceA[i][j]+matriceB[i][j];
                System.out.print(sum[i][j]);
                System.out.print("\t");
            }
            System.out.println("\n");
        }

    }
}
