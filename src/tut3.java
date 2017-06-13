public class tut3 {
    public static void main(String[] args) {
        int a= 10;
        int b=9;
        int c= 1000;
        int k;

        if (a>=b&& a>=c){
         //   System.out.println("a is greater");
            k=1;
        }

      else  if (b>=a&& b>=c){
            //   System.out.println("a is greater");
            k=2;
        }
        else {k=3;
      }

      switch (k){

          case 1:
              System.out.println("a is greater");
              break;
          case 2:
              System.out.println("b is greater");
              break;
          case 3:
              System.out.println("c is greater");
              break;
          default: System.out.println("There is an error");
          break;
      }

    }
}
