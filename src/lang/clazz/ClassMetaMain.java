package lang.clazz;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        //Class 조회
        Class clazz = String.class; // 클래스에서 조회 /단건 조회
        Class clazz1 = new String().getClass(); // 인스턴스에서 조회
        Class clazz2 = Class.forName("java.lang.String");// 문자열로 조회
    }
}
