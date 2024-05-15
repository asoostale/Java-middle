package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "짱구.마징가.디아블로";
        String str1 = "안녕";
        String[] splitStr = str.split(".");
        for (String s : splitStr) {
            System.out.println(s);
        }

            String result = new StringBuilder().append(str).append(str1).toString();

        System.out.println(result);

        String test1 = "이혜리";
        String test3 = " ";
        String test2 = "바보";

        String testResult = new StringBuilder().append(test1).append(test3).append(test2).toString();
        System.out.println("testResult = " + testResult);


    }
}
