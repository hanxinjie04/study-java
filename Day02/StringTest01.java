package Day02;

import sun.security.rsa.RSASignature;

/**
 * @ClassName StringTest01
 * @Description TODO
 * @Author 韩辛杰
 * @Date 2020/10/21
 **/

public class StringTest01 {
    public static void main(String[] args) {
        String s1 = "abc";
        s1 = "def";
        String s2 = "hellow";
        String s3 = "hellow";
        System.out.println(s2 == s3);
        String s4 = new String("abc");
        String s5 = new String("abc");
        System.out.println(s4 == s5);
        String s6 = "aaa";
        String s7 = "bbb";
        String s8 = s6 + s7;

    }

}
