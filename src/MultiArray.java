public class MultiArray {
    public static void main(String[] args) {
        int[][] numbers= {{1,2,3,4,5},{6,7,8,9,10}};

        for (int i=0; i<2;i++){

            for (int j=0; j<5;j++){
                System.out.print(numbers[i][j]);
                System.out.print("\t");
            }
            System.out.println("\n");
            System.out.println(numbers.length);
        }
    }
}
