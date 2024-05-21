package lang.system;

public class StringMain {
    public static void main(String[] args) {
        char[] arrayOrigin = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(arrayOrigin, 0,copiedArray, 0, arrayOrigin.length);

        for (char c : copiedArray) {
            System.out.println("c = " + c);
        }
           }
}
