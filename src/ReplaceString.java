public class ReplaceString {
    public static void main(String[] args) {
        String phrase="The quick brown fox jumps over the lazy dog";

        String newPhrase=phrase.replace("d","f");

        System.out.println(phrase);
        System.out.println(newPhrase);

//            int length= phrase.length();
//            char[] originalString= new char[length];
//            char[] newString=new char[length];
//
//
//            for (int i=0;i<length;i++){
//                originalString[i]=phrase.charAt(i);
//
//            }
//            newString=originalString;
//            for (int j=0; j<length;j++){
//                if("d".equals(newString[j])){
//                    "f".equals(newString[j]);
//                }
//            }
//            System.out.print("old string is: " );
//            for (int i=0; i<length; i++) {
//                System.out.print(originalString[i]);
//            }
//            System.out.println("/n");
//
//            System.out.print("new string is: " );
//            for (int j=0; j<length; j++) {
//                System.out.print(newString[j]);
//            }

    }
}
