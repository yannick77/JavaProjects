public class CopyArrayExample {
    public static void main(String[] args) {
        char[] copyFrom={'R','e','s','u','r','r','e','c','t','i','o','n'};
        char[] copyTo= new char[7];

        System.arraycopy(copyFrom,2,copyTo,0,7);
        System.out.println(new String(copyTo));
    }
}
