public class CreateGrid {
    public static void main(String[] args) {
        String[][] dash=new String[10][10];

        for(int i=0; i<10; i++){

            for(int j=0;j<10; j++){
                dash[i][j]="-";
                System.out.print(dash[i][j]);
                System.out.print("\t");
            }
            System.out.println("\n");
        }


    }
}
