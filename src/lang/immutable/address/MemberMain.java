package lang.immutable.address;

import java.lang.reflect.Member;

public class MemberMain {
    public static void main(String[] args) {


        MemberV1 memberV1 = new MemberV1();

        memberV1.setName("이혜리");
        memberV1.setAge(27);


        MemberV1 memberV2 = new MemberV1();
        memberV2.setName("이혜리");
        memberV2.setAge(27);

        System.out.println(memberV1.getName() == memberV2.getName() );
        System.out.println(memberV1.getAge() == memberV2.getAge() );

        System.out.println(memberV1.equals(memberV2));


        String a = "안녕";
        String b = "안녕";

        System.out.println(a.equals(b));
        System.out.println(a.getClass());
        System.out.println(b.getClass());
        a.toString();

        System.out.println(a.toString());




    }
}
